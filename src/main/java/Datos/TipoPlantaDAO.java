package Datos;

import Conexion.Conexion;
import modelo.TipoPlanta;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TipoPlantaDAO {
    private static final String insertSQL="INSERT INTO TIPOPLANTA(id_tipo,tipo,descripcion)VALUES(?,?,?)";
    private static final String updateSQL="UPDATE TIPOPLANTA SET tipo=?,descripcion=? WHERE id_tipo=?";
    public List<TipoPlanta> Listar(){ //para ver la lista
        Connection conn = null;
        PreparedStatement state =null;
        ResultSet result =null;

        List<TipoPlanta> tipoplan= new ArrayList<>();

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT *FROM TIPOPLANTA");
            result = state.executeQuery();
            while (result.next()){
                int id_tipo = result.getInt("id_tipo");
                String tipo = result.getString("tipo");
                String descripcion = result.getString("descripcion");

                TipoPlanta tipoPlanta = new TipoPlanta(id_tipo,tipo,descripcion);
                tipoplan.add(tipoPlanta);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(result);
            Conexion.close(state);
            Conexion.close(conn);
        }
        return tipoplan;
    }
    public void agregarTipoPlanta(TipoPlanta tipoPlanta) { //para agregar si es necesario
        Connection conn = null;
        PreparedStatement state = null;
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(insertSQL);

            state.setInt(1,tipoPlanta.getId_tipo());
            state.setString(2,tipoPlanta.getTipo());
            state.setString(3,tipoPlanta.getDescripcion());

            state.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }
    public int modificarTipoPlanta(TipoPlanta tipoPlanta){ //para modificar si es necesario también
        Connection conn = null;
        PreparedStatement state = null;
        int registros=0;

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1,tipoPlanta.getTipo());
            state.setString(2,tipoPlanta.getDescripcion());
            state.setInt(3,tipoPlanta.getId_tipo());

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
