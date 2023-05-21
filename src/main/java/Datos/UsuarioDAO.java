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

    public List<Usuario> selecionar(){
        Connection conn = null;
        Statement state = null;
        ResultSet result = null;
        Usuario usuario = null;

        List<Usuario> usuarios = new ArrayList<>();
        try{
            conn = Conexion.getConnection();
            state = conn.createStatement();
            result = state.executeQuery(selectSQL);

            while (result.next()){
                int id_usuario = result.getInt("id_usuario");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                String correo = result.getString("correo");
                String id_usuarioN = result.getString("id_usuarioN");

                usuario = new Usuario(id_usuario,nombre,apellido,correo,id_usuarioN);
                usuarios.add(usuario);

            }
            Conexion.close(result);
            Conexion.close((ResultSet) state);
            Conexion.close(conn);

            for(Usuario usuar: usuarios){
                System.out.println("Id_usuario: "+ usuar.getId_usuario());

            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return usuarios;


    }
}
