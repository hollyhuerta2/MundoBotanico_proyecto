package Controlador2;


import Datos.ZonaDAO;
import modelo.Zona;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SvListarZona", value = "/SvListarZona")
public class SvListarZona extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ZonaDAO zonaDAO = new ZonaDAO();
        List<Zona> zonas = zonaDAO.Listar();
        request.setAttribute("zonas", zonas);
        request.getRequestDispatcher("./Jsp/Zonas.jsp").forward(request, response);

    }


}
