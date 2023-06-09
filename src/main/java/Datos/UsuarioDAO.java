package Datos;

import Conexion.Conexion;
import modelo.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    public static final String insertSQL ="INSERT INTO usuario(id_usuario, nombre, apellido, correo, id_usuarioN) VALUES(?,?,?,?,?)";
    public static final String updateSQL= "UPDATE usuario SET nombre =?, apellido = ?, correo = ?, id_usuarioN =? WHERE id_usuarioN = ?";
    public static final String deleteSQL= "DELETE FROM usuario WHERE id_usuarioN = ?";

    public List<Usuario> selecionar() {
        Connection conn = null;
       PreparedStatement state =null;
       ResultSet result =null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT *FROM usuario ORDER BY id_usuario ASC;");
            result = state.executeQuery();

            while (result.next()) {
                int id_usuario = result.getInt("id_usuario");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                String correo = result.getString("correo");
                String id_usuarioN = result.getString("id_usuarioN");

                Usuario usuario = new Usuario(id_usuario,nombre,apellido,correo,id_usuarioN);
                usuarios.add(usuario);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Conexion.close(result);
            Conexion.close(state);
            Conexion.close(conn);
        }

        return usuarios;
    }
    public void agregar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement state = null;
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(insertSQL);

            state.setInt(1,usuario.getId_usuario());
            state.setString(2,usuario.getNombre());
            state.setString(3, usuario.getApellido());
            state.setString(4, usuario.getCorreo());
            state.setString(5, usuario.getId_usuarioN());

                state.executeUpdate();
               /* if(registros>0)
                    System.out.println("El Registro se ha guardado correctamente! ");*/

               // Usuario usuario1 = new Usuario();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }
    public int modificar(Usuario usuario){
        Connection conn = null;
        PreparedStatement state = null;
        int registros=0;

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1, usuario.getNombre());
            state.setString(2, usuario.getApellido());
            state.setString(3, usuario.getCorreo());
            state.setString(4, usuario.getId_usuarioN());
            state.setString(5, usuario.getId_usuarioN());

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
    public void eliminar(String usuario){
        Connection conn =null;
        PreparedStatement state =null;
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(deleteSQL);

            state.setString(1, usuario );
             state.executeUpdate();

           // Usuario usuario3 = new Usuario();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            Conexion.close(state);
            Conexion.close(conn);

        }
    }
    public Usuario identificar(String user)throws Exception{
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet rs = null;
        Usuario usu= null;

        String sql = "SELECT * FROM USUARIO WHERE id_usuarioN= ?";
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(sql);
            state.setString(1,user);
            rs= state.executeQuery();

            if(rs.next()){
                usu = new Usuario();
                usu.setId_usuario(rs.getInt("id_usuario"));
                usu.setNombre(rs.getString("nombre"));
                usu.setApellido(rs.getString("apellido"));
                usu.setCorreo(rs.getString("correo"));
                usu.setId_usuarioN(rs.getString("id_usuarioN"));
                usu = new Usuario();
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }finally{
           Conexion.close(rs);
           Conexion.close(state);
           Conexion.close(conn);
        }
        return usu;

    }
}
