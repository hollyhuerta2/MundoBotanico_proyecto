package Controlador;

import Datos.UsuarioDAO;
import modelo.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SVRegistroU", value = "/SVRegistroU")
public class SVRegistroU extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String correo = request.getParameter("correo");
            String id_usuarioN = request.getParameter("id_usuarioN");

            UsuarioDAO usDao = new UsuarioDAO();
            Usuario usuarios = new Usuario(id_usuario,nombre,apellido,correo,id_usuarioN);

            usDao.agregar(usuarios);
            response.sendRedirect("../Jsp/Usuario.jsp");

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("ha ocurrido un error al registrar al usuario");

        }
    }
}
