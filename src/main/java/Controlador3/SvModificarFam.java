package Controlador3;

import Datos.FamiliaDAO;
import modelo.Familia;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvModificarFam", value = "/SvModificarFam")
public class SvModificarFam extends HttpServlet {
    private FamiliaDAO famDAO;
    public void init(){
        famDAO = new FamiliaDAO();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_fam = Integer.parseInt(request.getParameter("id_fam"));
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        Familia familia = new Familia(id_fam,nombre,descripcion);

        try{
            famDAO.modificarFamilia(familia);
            response.sendRedirect("./mensajeExitoAdmin.jsp");
        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("msj","Error!");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }

    }
}
