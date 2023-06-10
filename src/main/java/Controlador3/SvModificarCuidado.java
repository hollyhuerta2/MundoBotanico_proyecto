package Controlador3;

import Datos.CuidadoPlanDAO;
import modelo.CuidadoPlan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvModificarCuidado", value = "/SvModificarCuidado")
public class SvModificarCuidado extends HttpServlet {
    private CuidadoPlanDAO cuidadoDao;
    public void init(){
        cuidadoDao = new CuidadoPlanDAO();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_cuidado = Integer.parseInt(request.getParameter("id_cuidado"));
        int tipofk = Integer.parseInt(request.getParameter("tipofk"));
        String descripcion = request.getParameter("descripcion");
        CuidadoPlan cuidadoPlan = new CuidadoPlan(id_cuidado,descripcion,tipofk);
        try{
            cuidadoDao.modificarCuidado(cuidadoPlan);
            response.sendRedirect("./mensajeExitoAdmin.jsp");

        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }


    }
}
