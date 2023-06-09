package Controlador2;


import Datos.CuidadoPlanDAO;
import modelo.CuidadoPlan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SvCuidados", value = "/SvCuidados")
public class SvCuidados extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CuidadoPlanDAO cuidadoPlan = new CuidadoPlanDAO();
        List<CuidadoPlan> cuidadoPlans = cuidadoPlan.Listar();
        request.setAttribute("cuidados", cuidadoPlans);
        request.getRequestDispatcher("./Jsp/CuidadosPlan.jsp").forward(request, response);
    }
}
