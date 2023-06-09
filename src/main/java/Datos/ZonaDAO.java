package Datos;

import Conexion.Conexion;
import modelo.Zona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ZonaDAO {
    private static final String insertSQL="INSERT INTO ZONA(id_zona,zona,area_geo) VALUES (?,?,?)";
    private static final String updateSQL="UPDATE ZONA SET zona=?,area_geo=? WHERE id_zona=?";

    public List<Zona> Listar() { //para ver la lista
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet result = null;

        List<Zona> zonas = new ArrayList<>();
        try {

            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT *FROM ZONA");
            result = state.executeQuery();

            while (result.next()) {
                int id_zona = result.getInt("id_zona");
                String zona = result.getString("zona");
                String area_geo = result.getString("area_geo");

                Zona zona1 = new Zona(id_zona, zona, area_geo);
                zonas.add(zona1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(result);
            Conexion.close(state);
            Conexion.close(conn);
        }
        return zonas;
    }
    public void agregarZona(Zona zona) { //para agregar si es necesario
        Connection conn = null;
        PreparedStatement state = null;
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(insertSQL);

            state.setInt(1,zona.getId_zona());
            state.setString(2, zona.getZona());
            state.setString(3,zona.getZona());

            state.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }
    public int modificarZona(Zona zona){ //para modificar si es necesario también
        Connection conn = null;
        PreparedStatement state = null;
        int registros=0;

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1, zona.getZona());
            state.setString(2, zona.getArea_geo());
            state.setInt(3,zona.getId_zona());

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
