package Controlador3;


import Datos.PlantasDAO;
import modelo.Plantas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvAgregarPlantas", value = "/SvAgregarPlantas")
public class SvAgregarPlantas extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            int id_planta = Integer.parseInt(request.getParameter("id_planta"));
            String nombre_com = request.getParameter("nombre_com");
            String  nombre_cient = request.getParameter("nombre_cient");
            int tipofk =Integer.parseInt(request.getParameter(" tipofk"));
            int tipohojafk =Integer.parseInt(request.getParameter("tipohojafk"));
            int zonafk =Integer.parseInt(request.getParameter("zonafk"));
            int familiafk =Integer.parseInt(request.getParameter("familiafk"));

            Plantas planta = new Plantas(id_planta,nombre_com,nombre_cient,tipofk,tipohojafk,zonafk,familiafk);

            PlantasDAO plantasDAO= new PlantasDAO();
            plantasDAO.agregarPlantas(planta);
            response.sendRedirect("./mensajeExitoAdmin.jsp");

        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }

    }
}
