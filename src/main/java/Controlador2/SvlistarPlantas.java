package Controlador2;

import Datos.PlantasDAO;
import modelo.Plantas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SvlistarPlantas", value = "/SvlistarPlantas")
public class SvlistarPlantas extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PlantasDAO plantasDAO = new PlantasDAO();
        List<Plantas> plantas= plantasDAO.selecionar();
        request.setAttribute("plantas", plantas);
        request.getRequestDispatcher("").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
