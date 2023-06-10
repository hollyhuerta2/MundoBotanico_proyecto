package Controlador3;

import Datos.ZonaDAO;
import modelo.Zona;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvModificarZona", value = "/SvModificarZona")
public class SvModificarZona extends HttpServlet {
    private ZonaDAO zonaDAO;

    public void init(){
        zonaDAO= new ZonaDAO();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_zona = Integer.parseInt(request.getParameter("id_zona"));
        String zona = request.getParameter("zona");
        String area_geo = request.getParameter("area_geo");
        Zona zona1 = new Zona(id_zona,zona,area_geo);

        try{
            zonaDAO.modificarZona(zona1);
            response.sendRedirect("./mensajeExitoAdmin.jsp");
        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }

    }
}
