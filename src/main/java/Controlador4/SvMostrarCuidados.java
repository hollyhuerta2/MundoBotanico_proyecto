package Controlador4;

import Datos.CuidadoPlanDAO;
import modelo.CuidadoPlan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SvMostrarCuidados", value = "/SvMostrarCuidados")
public class SvMostrarCuidados extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CuidadoPlanDAO cuidadoPlan = new CuidadoPlanDAO();
        List<CuidadoPlan> cuidadoPlans = cuidadoPlan.Listar();
        request.setAttribute("cuidados", cuidadoPlans);
        request.getRequestDispatcher("./Jsp3/MostrarCuidados.jsp").forward(request, response);

    }
}