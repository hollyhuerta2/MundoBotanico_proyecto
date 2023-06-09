package Controlador2;

import Datos.CuidadoPlanDAO;
import Datos.PlantaUsDAO;
import modelo.CuidadoPlan;
import modelo.Planta_Us;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SvUsPlan", value = "/SvUsPlan")
public class SvUsPlan extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PlantaUsDAO plantaUsDAO = new PlantaUsDAO();
        List<Planta_Us> plantaUses = plantaUsDAO.Listar();
        request.setAttribute("UsPlan", plantaUses);
        request.getRequestDispatcher("./Jsp/PlanUsu.jsp").forward(request, response);

    }
}
