package Controlador4;

import Datos.TipoPlantaDAO;
import modelo.TipoPlanta;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SvMostrarTP", value = "/SvMostrarTP")
public class SvMostrarTP extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TipoPlantaDAO tipoPlanta = new TipoPlantaDAO();
        List<TipoPlanta> tipoPlantas = tipoPlanta.Listar();
        request.setAttribute("tipoplantas", tipoPlantas);
        request.getRequestDispatcher("./Jsp3/MostrarTipoPlan.jsp").forward(request, response);

    }
}
