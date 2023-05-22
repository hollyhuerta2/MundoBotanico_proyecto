package Datos.Main;

import Datos.UsuarioDAO;
import modelo.Usuario;

import java.util.List;

public class UsuarioMain {
    public static void main(String[] args){
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        List<Usuario> usuarios = usuarioDAO.selecionar();

        for(Usuario usuario: usuarios){
            System.out.println("Id_usuario: " + usuario.getId_usuario());
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("apellido: " + usuario.getApellido());
            System.out.println("correo: " + usuario.getCorreo());
            System.out.println("nombre de usuario: " + usuario.getId_usuarioN());
            System.out.println("\n");
        }
        Usuario newUsuario = new Usuario(6,"Romi","choco","kuromi@hotmail.com","Kuromilovex" );

        int registrosAg = usuarioDAO.agregar(newUsuario);
        System.out.println("Registro agregado: "+ registrosAg);

        List<Usuario> usuarioafter = usuarioDAO.selecionar();
            System.out.println("\nLista de Usuarios actualizados! :D\n");

            for(Usuario usuario: usuarioafter){
                System.out.println("Id_usuario: " + usuario.getId_usuario());
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("apellido: " + usuario.getApellido());
                System.out.println("correo: " + usuario.getCorreo());
                System.out.println("nombre de usuario: " + usuario.getId_usuarioN());
                System.out.println("\n");
            }
    }

}
