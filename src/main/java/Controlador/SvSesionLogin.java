package Controlador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvSesionLogin", value = "/SvSesionLogin")
public class SvSesionLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.getRequestDispatcher("./Jsp/Admin.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nameUser = request.getParameter("nombre");
        String User2 = request.getParameter("nombre usuario");

        if("Holly".equals(nameUser)&& "Admin".equals(User2)){
            request.setAttribute("usuario",nameUser);
            request.getRequestDispatcher("./Jsp/Admin.jsp").forward(request,response);
        }else if(!"Admin".equals(User2)) {
            request.setAttribute("user",User2);
            request.getRequestDispatcher("./Jsp/UsuarioNormal.jsp").forward(request,response);
        }else{
            request.setAttribute("Error","Usuario desconocido, intente de nuevo");
            request.getRequestDispatcher("./mensaje.jsp").forward(request,response);
        }

    }
}
