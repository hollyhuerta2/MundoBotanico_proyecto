package Controlador2;

import Datos.FamiliaDAO;
import modelo.Familia;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SvListarFamilia", value = "/SvListarFamilia")
public class SvListarFamilia extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        FamiliaDAO famDao = new FamiliaDAO();
        List<Familia> familias = famDao.ListaFam();
        request.setAttribute("familias", familias);
        request.getRequestDispatcher("./Jsp/Familias.jsp").forward(request, response);

    }
}
