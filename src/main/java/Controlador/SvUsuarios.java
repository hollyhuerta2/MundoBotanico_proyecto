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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = usuarioDAO.selecionar();
        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("../Usuario.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        try{
            if(accion !=null){
                switch (accion){
                    case "verificar":
                        verificar(request,response);
                        break;
                    case "cerrar":
                        cerrarsesion(request, response);
                        break;
                    default:
                        response.sendRedirect("index.jsp");
                        break;
                }
            }else {
                response.sendRedirect("index.jsp");
            }
        } catch (Exception e) {
            try {
                this.getServletConfig().getServletContext().getRequestDispatcher("/mensaje.jsp").forward(request, response);

            } catch (Exception ex) {
                System.out.println("Error" + e.getMessage());
            }
        }
    }
    //para la sesion
    private void verificar(HttpServletRequest request, HttpServletResponse response)
            throws Exception{
        HttpSession sesion;
        UsuarioDAO daoUsu;
        Usuario user;

        user = this.obtenerUsuario(request);
        daoUsu = new UsuarioDAO();
        //user = daoUsu.identificar(user);

        if(user !=null ){
            if(user.getId_usuarioN().equals("Admin")){
                sesion = request.getSession();
                sesion.setAttribute("Usuario Admin", user);
                request.setAttribute("msj","Bienvenido a MB");
                this.getServletConfig().getServletContext().getRequestDispatcher("../Jsp/Usuario.jsp").forward(request,response);

            }else{
                sesion = request.getSession();
                sesion.setAttribute("Usuario ",user);//acá debo cambiarlo, pero para las pruebas tengo que checar
                this.getServletConfig().getServletContext().getRequestDispatcher("../Jsp/Usuario.jsp").forward(request,response);
               // response.sendRedirect("?????????");
            }
        }else{
            request.setAttribute("msj","Credenciales incorrectas");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }
    private void cerrarsesion(HttpServletRequest request, HttpServletResponse response)
            throws Exception{
        HttpSession session = request.getSession();
        session.setAttribute("Usuario", null);
        session.invalidate();
        response.sendRedirect("index.jsp");

    }
    private Usuario obtenerUsuario(HttpServletRequest request){
            Usuario uss = new Usuario();
            uss.setNombre(request.getParameter("txtNameUser"));
            uss.setId_usuarioN(request.getParameter("txtUser"));

        return uss;
    }
}
