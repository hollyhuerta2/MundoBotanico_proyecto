package Controlador3;

import Datos.ThojaDAO;
import modelo.TipoHoja;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvModificarHoja", value = "/SvModificarHoja")
public class SvModificarHoja extends HttpServlet {
    private ThojaDAO thojaDAO;

    public void init(){
        thojaDAO = new ThojaDAO();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_hoja = Integer.parseInt(request.getParameter("id_hoja"));
        String tipoh = request.getParameter("tipoh");
        String descripcion = request.getParameter("descripcion");
        TipoHoja tipoHoja = new TipoHoja(id_hoja,tipoh,descripcion);

        try{
            thojaDAO.modificarTipoHoja(tipoHoja);
            response.sendRedirect("./mensajeExitoAdmin.jsp");

        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}
