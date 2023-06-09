package Datos;

import Conexion.Conexion;
import modelo.Planta_Us;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlantaUsDAO {
    private static final String insertSQL="INSERT INTO PLANTA_US(id_planus,usuariofk,plantasfk)VALUES(?,?,?)";
    private static final String updateSQL="UPDATE PLANTA_US SET usuariofk=?,plantasfk=? WHERE id_planus=?";

    public List<Planta_Us> Listar() { //para ver la lista
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet result = null;

        List<Planta_Us> plantaUses = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT *FROM PLANTA_US");
            result = state.executeQuery();
            while (result.next()) {
                int id_planus = result.getInt("id_planus");
                int usuariofk = result.getInt("usuariofk");
                int plantasfk = result.getInt("plantasfk");

                Planta_Us plantaUs = new Planta_Us(id_planus,usuariofk,plantasfk);
                plantaUses.add(plantaUs);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(result);
            Conexion.close(state);
            Conexion.close(conn);
        }
        return plantaUses;

    }
    public void agregarPlantaUs(Planta_Us plantaUs) { //para agregar si es necesario
        Connection conn = null;
        PreparedStatement state = null;
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(insertSQL);

            state.setInt(1,plantaUs.getId_planus());
            state.setInt(2,plantaUs.getUsuariofk());
            state.setInt(3,plantaUs.getPlantasfk());

            state.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }
    public int modificarPlantaUs(Planta_Us plantaUs){ //para modificar si es necesario también
        Connection conn = null;
        PreparedStatement state = null;
        int registros=0;

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setInt(1,plantaUs.getUsuariofk());
            state.setInt(2,plantaUs.getPlantasfk());
            state.setInt(3,plantaUs.getId_planus());

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
