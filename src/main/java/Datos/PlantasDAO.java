package Datos;

import Conexion.Conexion;
import modelo.Plantas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlantasDAO {
    public static final String insertSQL= "INSERT INTO PLANTAS(id_planta, nombre_com, nombre_cient, tipofk, tipohojafk,zonafk,familiafk) VALUES(?,?,?,?,?,?,?)";
    public static final String updateSQL ="UPDATE PLANTAS SET  nombre_com=?, nombre_cient=?, tipofk=?, tipohojafk=?,zonafk=?,familiafk=? WHERE id_planta=?";

    public List<Plantas> selecionar() {
        Connection conn = null;
        PreparedStatement state =null;
        ResultSet result =null;

        List<Plantas> plantas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT *FROM PLANTAS");
            result = state.executeQuery();

            while (result.next()) {
                int id_planta = result.getInt("id_planta");
                String nombre_com = result.getString("nombre_com");
                String nombre_cient = result.getString("nombre_cient");
                int tipofk = result.getInt("tipofk");
                int tipohojafk = result.getInt("tipohojafk");
                int zonafk = result.getInt("zonafk");
                int familiafk = result.getInt("familiafk");



                Plantas plantas1 = new Plantas(id_planta,nombre_com,nombre_cient,tipofk,zonafk,familiafk,tipohojafk);
                plantas.add(plantas1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Conexion.close(result);
            Conexion.close(state);
            Conexion.close(conn);
        }

        return plantas;
    }
    public void agregarPlantas(Plantas plantas) {
        Connection conn = null;
        PreparedStatement state = null;
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(insertSQL);

            state.setInt(1,plantas.getId_planta());
            state.setString(2,plantas.getNombre_com());
            state.setString(3,plantas.getNombre_cient());
            state.setInt(4,plantas.getTipofk());
            state.setInt(5,plantas.getTipohojafk());
            state.setInt(6,plantas.getZonafk());
            state.setInt(7,plantas.getFamiliafk());


            state.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }
    public int modificarPlantas(Plantas plantas){
        Connection conn = null;
        PreparedStatement state = null;
        int registros=0;

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1,plantas.getNombre_com());
            state.setString(2,plantas.getNombre_cient());
            state.setInt(3,plantas.getTipofk());
            state.setInt(4,plantas.getTipohojafk());
            state.setInt(5,plantas.getZonafk());
            state.setInt(6,plantas.getFamiliafk());
            state.setInt(7,plantas.getId_planta());


            registros = state.executeUpdate();

            if(registros>0) System.out.println("Tu registro ha sido actualizado");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
        return registros;
    }
}
