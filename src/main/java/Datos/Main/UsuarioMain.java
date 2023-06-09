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
        Usuario newUsuario = new Usuario(10,"Sofia","oliv","olivia21@hotmail.com","olivia" );

       /* int registrosAg = usuarioDAO.agregar(newUsuario);
        System.out.println("Registro agregado: "+ registrosAg);*/


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

        //modificar
        String idUsuarioNMod = "KuromilovEra7";
        Usuario usuarioExist = new Usuario();
            usuarioExist.setId_usuarioN(idUsuarioNMod);
            usuarioExist.setNombre("Romina");
            usuarioExist.setApellido("choco");
            usuarioExist.setCorreo(" kuromi@hotmail.com");
            int registrosMod = usuarioDAO.modificar(usuarioExist);
            System.out.println("Registros modificados: "+registrosMod);

        /*//eliminar
            int usuarioDelete =8; //id usuario
            int registrosElim = usuarioDAO.eliminar(usuarioDelete);
            System.out.println("Registros eliminados: "+registrosElim);*/
    }



}
