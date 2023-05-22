package Datos;

import Conexion.Conexion;
import modelo.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    public static final  String selectSQL ="SELECT *FROM usuario";
    public static final String insertSQL ="INSERT INTO usuario(id_usuario, nombre, apellido, correo, id_usuarioN) VALUES(?,?,?,?,?)";
    public static final String updateSQL= "UPDATE usuario SET id_usuario =?, nombre =?,apellido =?,correo=?, id_usuarioN =?";
    public static final String deleteSQL= "DELETE FROM usuario WHERE id_usuario = ?";

    public List<Usuario> selecionar() {
        Connection conn = null;
        Statement state = null;
        ResultSet result = null;
        Usuario usuario = null;

        List<Usuario> usuarios = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            state = conn.createStatement();
            result = state.executeQuery(selectSQL);

            while (result.next()) {
                int id_usuario = result.getInt("id_usuario");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                String correo = result.getString("correo");
                String id_usuarioN = result.getString("id_usuarioN");

                usuario = new Usuario(id_usuario, nombre, apellido, correo, id_usuarioN);
                usuarios.add(usuario);

            }
            Conexion.close(result);
            Conexion.close((ResultSet) state);
            Conexion.close(conn);

            for (Usuario usuar : usuarios) {
                System.out.println("Id_usuario: " + usuar.getId_usuario());
                System.out.println("Nombre: " + usuar.getNombre());
                System.out.println("apellido: " + usuar.getApellido());
                System.out.println("correo: " + usuar.getCorreo());
                System.out.println("nombre de usuario: " + usuar.getId_usuarioN());
                System.out.println("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }
    public int agregar(Usuario usuario){
        Connection conn = null;
        PreparedStatement state = null;
        int registros=0;

        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(insertSQL);

            state.setInt(1,usuario.getId_usuario());
            state.setString(2,usuario.getNombre());
            state.setString(3, usuario.getApellido());
            state.setString(4, usuario.getCorreo());
            state.setString(5, usuario.getId_usuarioN());

                registros = state.executeUpdate();
                if(registros>0)
                    System.out.println("El Registro se ha guardado correctamente! ");

                Conexion.close(state);
                Conexion.close(conn);
                Usuario usuario1 = new Usuario();

        }catch (Exception e){
            e.printStackTrace();
        }

        return registros;
    }
    public int modificar(Usuario usuario){
        Connection conn = null;
        PreparedStatement state = null;
        int registros=0;

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setInt(1,usuario.getId_usuario());
            state.setString(2,usuario.getNombre());
            state.setString(3, usuario.getApellido());
            state.setString(4, usuario.getCorreo());
            state.setString(5, usuario.getId_usuarioN());

            registros = state.executeUpdate();

            if(registros>0) System.out.println("Tu registro ha sido actualizado");

            Conexion.close(state);
            Conexion.close(conn);
            Usuario usuario2 = new Usuario();

        }catch (Exception e){
            e.printStackTrace();
        }
        return registros;
    }
    public int eliminar(Usuario usuario){
        Connection conn =null;
        PreparedStatement state =null;
        int registros=0;
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(deleteSQL);

            state.setInt(1, usuario.getId_usuario());
            registros= state.executeUpdate();

            if(registros>0) System.out.println("El registro ha sido eliminado");

            Conexion.close(state);
            Conexion.close(conn);
            Usuario usuario3 = new Usuario();

        }catch(Exception e){
            e.printStackTrace();
        }
        return registros;
    }
}
