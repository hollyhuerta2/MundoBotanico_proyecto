package Controlador;

import Datos.UsuarioDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvEliminarUs", value = "/SvEliminarUs")
public class SvEliminarUs extends HttpServlet {
    private UsuarioDAO usDao;

    public void init(){
        usDao = new UsuarioDAO();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id_usuarioN = request.getParameter("id_usuarioN");
        usDao.eliminar(Integer.parseInt(id_usuarioN));
        response.sendRedirect("./Jsp/Usuario.jsp");

    }
}
