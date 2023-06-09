package Controlador;

import Datos.UsuarioDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvEliminarUs", value = "/SvEliminarUs")
public class SvEliminarUs extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String id_usuarioN = request.getParameter("id_usuarioN");
            UsuarioDAO usDao = new UsuarioDAO();

            usDao.eliminar(id_usuarioN);
            response.sendRedirect("./mensajeExitoAdmin.jsp");
        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }

    }
}
