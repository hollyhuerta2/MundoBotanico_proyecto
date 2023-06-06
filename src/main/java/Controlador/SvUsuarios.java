package Controlador;

import Datos.UsuarioDAO;
import modelo.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "SvUsuarios", value = "/SvUsuarios")
public class SvUsuarios extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        try{
            if(accion !=null){
                switch (accion){
                    case "verificar":
                        verificar(request,response);
                        break;
                    case "cerrar":
                        cerrarsesion(request, response);
                    default:
                        response.sendRedirect("index.jsp");
                }
            }
        } catch (Exception e) {
            try {
                this.getServletConfig().getServletContext().getRequestDispatcher("/mensaje.jsp").forward(request, response);

            } catch (Exception ex) {
                System.out.println("Error" + e.getMessage());
            }
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            List<Usuario> usuario = new UsuarioDAO().selecionar();
            System.out.println("Usuarios" + usuario);
            request.setAttribute("usuarios", usuario);
            request.getRequestDispatcher("Jsp/Usuario.jsp").forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("ha ocurrido un error al cargar la lista de Usuarios");
        }
    }
}
