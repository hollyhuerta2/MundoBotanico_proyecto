package Conexion;

import java.sql.*;

public class ConexionMain {
    public static void main(String[] args){
        try{
            Connection conn = Conexion.getConnection();

            String sql= "SELECT * FROM PLANTAS WHERE nombre_com LIKE ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,"L%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id_planta = rs.getInt("id_planta");
                String nombre_com = rs.getString("nombre_com");
                String nombre_cient = rs.getString("nombre_cient");
                System.out.println("id:" +id_planta+"\nnombre común: " + nombre_com+"\nnombre científico: " + nombre_cient);
            }
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }catch (SQLException ex){
            ex.printStackTrace(System.out.printf("La conexion falló"));
        }
    }
}
