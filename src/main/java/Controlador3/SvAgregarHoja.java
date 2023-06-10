package Controlador3;


import Datos.ThojaDAO;
import modelo.TipoHoja;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvAgregarHoja", value = "/SvAgregarHoja")
public class SvAgregarHoja extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            int id_hoja = Integer.parseInt(request.getParameter("id_hoja"));
            String tipoh = request.getParameter("tipoh");
            String descripcion = request.getParameter("descripcion");

            TipoHoja hoja = new TipoHoja(id_hoja,tipoh,descripcion);

            ThojaDAO thojaDAO= new ThojaDAO();
            thojaDAO.agregarTipoHoja(hoja);
            response.sendRedirect("./mensajeExitoAdmin.jsp");

        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }

    }
}
