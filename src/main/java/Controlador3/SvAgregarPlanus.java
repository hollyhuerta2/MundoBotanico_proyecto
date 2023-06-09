package Controlador3;

import Datos.PlantaUsDAO;
import modelo.Planta_Us;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvAgregarPlanus", value = "/SvAgregarPlanus")
public class SvAgregarPlanus extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try{
                int id_planus = Integer.parseInt(request.getParameter("id_planus"));
                int usuariofk = Integer.parseInt((request.getParameter("usuariofk")));
                int plantasfk = Integer.parseInt((request.getParameter("plantasfk")));

                Planta_Us plantaUs = new Planta_Us(id_planus,usuariofk,plantasfk);

                PlantaUsDAO plantaUsDAO= new PlantaUsDAO();
                plantaUsDAO.agregarPlantaUs(plantaUs);
                response.sendRedirect("./mensajeExitoAdmin.jsp");

            }catch (Exception e){
                e.printStackTrace();
                request.setAttribute("msj","Error!");
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
    }
}
