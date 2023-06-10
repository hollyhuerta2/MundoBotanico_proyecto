package Controlador3;


import Datos.CuidadoPlanDAO;
import modelo.CuidadoPlan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvAgregarCuidado", value = "/SvAgregarCuidado")
public class SvAgregarCuidado extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            int id_cuidado = Integer.parseInt(request.getParameter("id_cuidado"));
            int tipofk = Integer.parseInt((request.getParameter("tipofk")));
            String descripcion = request.getParameter("descripcion");

            CuidadoPlan cuidados = new CuidadoPlan(id_cuidado,descripcion,tipofk);

            CuidadoPlanDAO cuidadoDAO= new CuidadoPlanDAO();
            cuidadoDAO.agregarCuidado(cuidados);
            response.sendRedirect("./mensajeExitoAdmin.jsp");

        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }

    }
}
