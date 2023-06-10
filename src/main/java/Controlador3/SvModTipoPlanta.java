package Controlador3;

import Datos.TipoPlantaDAO;
import modelo.TipoPlanta;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvModTipoPlanta", value = "/SvModTipoPlanta")
public class SvModTipoPlanta extends HttpServlet {
    private TipoPlantaDAO tipoPlantaDAO;
    public void init(){
        tipoPlantaDAO = new TipoPlantaDAO();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_tipo = Integer.parseInt(request.getParameter("id_tipo"));
        String tipo = request.getParameter("tipo");
        String descripcion = request.getParameter("descripcion");
        TipoPlanta tipoPlanta = new TipoPlanta(id_tipo,tipo,descripcion);

        try{
            tipoPlantaDAO.modificarTipoPlanta(tipoPlanta);
            response.sendRedirect("./mensajeExitoAdmin.jsp");

        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}
