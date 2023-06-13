package Controlador;

import Datos.UsuarioDAO;
import modelo.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletNuevoUS", value = "/ServletNuevoUS")
public class ServletNuevoUS extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("./index.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String correo = request.getParameter("correo");
            String id_usuarioN = request.getParameter("id_usuarioN");

            /*Usuario user = new Usuario();
            user.setId_usuario(id_usuario);
            user.setNombre(nombre);
            user.setApellido(apellido);
            user.setCorreo(correo);
            user.setId_usuarioN(id_usuarioN);*/

            Usuario user = new Usuario(id_usuario, nombre, apellido, correo, id_usuarioN);
        try {
            UsuarioDAO usDao = new UsuarioDAO();
            usDao.agregar(user);
            response.sendRedirect("./ExitoRegis.jsp");
        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}
