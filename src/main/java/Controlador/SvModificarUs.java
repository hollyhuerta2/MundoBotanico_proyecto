package Controlador;

import Datos.UsuarioDAO;
import modelo.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvModificarUs", value = "/SvModificarUs")
public class SvModificarUs extends HttpServlet {
    private UsuarioDAO usDao;

    @Override
    public void init() {
        usDao = new UsuarioDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id_usuarioN= request.getParameter("id_usuarioN");
        try {
            Usuario usuario = usDao.identificar(id_usuarioN);
            request.setAttribute("usuario", usuario);
            request.getRequestDispatcher("./Jsp/EditarUs.jsp").forward(request,response);//cambiar ruta después de hacer el jsp
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id_usuarioN = request.getParameter("id_usuarioN");
        int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");

        Usuario usuario = new Usuario(id_usuario,nombre,apellido,correo,id_usuarioN);
        try{
            usDao.modificar(usuario);
            response.sendRedirect("./mensajeExitoAdmin.jsp");
        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }


    }
}
