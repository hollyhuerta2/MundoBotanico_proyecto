package Datos;

import Conexion.Conexion;
import modelo.TipoHoja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThojaDAO {
    private static final String insertSQL="INSERT INTO TIPOHOJA(id_hoja,tipoh,descripcion)VALUES(?,?,?)";
    private static final String updateSQL="UPDATE TIPOHOJA SET tipoh=?,descripcion=? WHERE id_hoja=?";

    public List<TipoHoja> Listar(){ //para ver la lista
        Connection conn = null;
        PreparedStatement state =null;
        ResultSet result =null;

        List<TipoHoja> tipoHojas= new ArrayList<>();

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT *FROM TIPOHOJA");
            result = state.executeQuery();
            while (result.next()){
                int id_hoja = result.getInt("id_hoja");
                String tipoh = result.getString("tipoh");
                String descripcion = result.getString("descripcion");

                TipoHoja tipoHoja = new TipoHoja(id_hoja,tipoh,descripcion);
                tipoHojas.add(tipoHoja);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(result);
            Conexion.close(state);
            Conexion.close(conn);
        }
        return tipoHojas;
    }
    public void agregarTipoHoja(TipoHoja tipoHoja) { //para agregar si es necesario
        Connection conn = null;
        PreparedStatement state = null;
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(insertSQL);

            state.setInt(1,tipoHoja.getId_hoja());
            state.setString(2,tipoHoja.getTipoh());
            state.setString(3,tipoHoja.getDescripcion());

            state.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }
    public int modificarTipoHoja(TipoHoja tipoHoja){ //para modificar si es necesario también
        Connection conn = null;
        PreparedStatement state = null;
        int registros=0;

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1,tipoHoja.getTipoh());
            state.setString(2,tipoHoja.getDescripcion());
            state.setInt(3,tipoHoja.getId_hoja());

            registros = state.executeUpdate();

            if(registros>0) System.out.println("Tu registro de cuidados ha sido actualizado");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
        return registros;
    }
}
