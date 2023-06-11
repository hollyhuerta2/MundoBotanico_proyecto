package Controlador4;

import Datos.ZonaDAO;
import modelo.Zona;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvBusZona", value = "/SvBusZona")
public class SvBusZona extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String zona = request.getParameter("zona");
        ZonaDAO zonaDAO = new ZonaDAO();
        Zona result = zonaDAO.buscarPorZona(zona);
        request.setAttribute("zona1",result);
        RequestDispatcher dispatcher = request.getRequestDispatcher("./Jsp3/BusZona.jsp");
        dispatcher.forward(request,response);

    }
}
