package Datos;

import Conexion.Conexion;
import modelo.CuidadoPlan;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CuidadoPlanDAO {
    public static final String insertSQL ="INSERT INTO CUIDADOPLAN(id_cuidado,tipofk,descripcion) VALUES(?,?,?)";
    public static final String updateSQL="UPDATE CUIDADOPLAN SET descripcion=? WHERE id_cuidado=?";

    public List<CuidadoPlan> Listar(){ //para ver la lista
        Connection conn = null;
        PreparedStatement state =null;
        ResultSet result =null;

        List<CuidadoPlan> cuidados= new ArrayList<>();

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT *FROM CUIDADOPLAN");
            result = state.executeQuery();
            while (result.next()){
                int id_cuidado = result.getInt("id_cuidado");
                int tipofk = result.getInt("tipofk");
                String descripcion = result.getString("descripcion");

                CuidadoPlan cuidadoPlan = new CuidadoPlan(id_cuidado,descripcion,tipofk);
                cuidados.add(cuidadoPlan);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(result);
            Conexion.close(state);
            Conexion.close(conn);
        }
        return cuidados;
    }
    public void agregarCuidado(CuidadoPlan cuid) { //para agregar si es necesario
        Connection conn = null;
        PreparedStatement state = null;
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(insertSQL);

            state.setInt(1,cuid.getId_cuidado());
            state.setInt(2,cuid.getTipofk());
            state.setString(3,cuid.getDescripcion());

            state.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }
    public int modificarCuidado(CuidadoPlan cuid1){ //para modificar si es necesario también
        Connection conn = null;
        PreparedStatement state = null;
        int registros=0;

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1,cuid1.getDescripcion());
            state.setInt(2,cuid1.getId_cuidado());

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
