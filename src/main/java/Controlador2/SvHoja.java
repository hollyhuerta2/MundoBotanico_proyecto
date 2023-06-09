package Controlador2;


import Datos.ThojaDAO;
import modelo.TipoHoja;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SvHoja", value = "/SvHoja")
public class SvHoja extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ThojaDAO hojaDAO = new ThojaDAO();
        List<TipoHoja> tipoHojas = hojaDAO.Listar();
        request.setAttribute("hojas", tipoHojas);
        request.getRequestDispatcher("./Jsp/TipoHojas.jsp").forward(request, response);

    }
}
