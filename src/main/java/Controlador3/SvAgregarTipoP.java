package Controlador3;


import Datos.TipoPlantaDAO;
import modelo.TipoPlanta;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvAgregarTipoP", value = "/SvAgregarTipoP")
public class SvAgregarTipoP extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            int id_tipo = Integer.parseInt(request.getParameter("id_tipo"));
            String tipo = request.getParameter("tipo");
            String descripcion = request.getParameter("descripcion");

            TipoPlanta tiplanta = new TipoPlanta(id_tipo,tipo,descripcion);

            TipoPlantaDAO tipoPlantaDAO= new TipoPlantaDAO();
            tipoPlantaDAO.agregarTipoPlanta(tiplanta);
            response.sendRedirect("./mensajeExitoAdmin.jsp");

        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }


    }
}
