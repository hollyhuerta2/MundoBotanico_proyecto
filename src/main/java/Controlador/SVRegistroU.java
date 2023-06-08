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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String correo = request.getParameter("correo");
            String id_usuarioN = request.getParameter("id_usuarioN");

            Usuario user = new Usuario();
            user.setId_usuario(id_usuario);
            user.setNombre(nombre);
            user.setApellido(apellido);
            user.setCorreo(correo);
            user.setId_usuarioN(id_usuarioN);

            UsuarioDAO usDao = new UsuarioDAO();
            int registros = UsuarioDAO.agregar(user);

        if(registros >0){
            request.setAttribute("msj","Usuario agregado exitosamente");
            response.sendRedirect("../Usuario.jsp");
        }else{
            request.setAttribute("msj","ha ocurrido un error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}
