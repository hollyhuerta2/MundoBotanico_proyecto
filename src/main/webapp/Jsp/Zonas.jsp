<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.Zona"%>
<%@ page import ="java.io.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
    <title>Zonas de plantas</title>
    <style>
        .imagen-redonda{
            width: 90px;
            height: 90px;
            border-radius: 50%;
            overflow: hidden;
        }
        .imagen-redonda img{
            float: left;
            margin-right:10px;
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
    </style>
</head>
<body>
<header>
    <div class="imagen-redonda">
        <img src="./imagen/cinnaicon.jpg" alt="logo">
    </div>
</header>
<h1>Tabla Familias</h1>
<%--  <div class="button-container">
       <a href="./Jsp/registroUsuario.jsp" class="button">REGISTRAR</a>
       <a href="./Jsp/EliminarUs.jsp" class="button">ELIMINAR</a>
       <a href="./Jsp/BuscarUs.jsp" class="button">MODIFICAR</a>
  </div>--%>
            <table>
                 <tr>
                     <th>id_zona</th>
                     <th>Zona</th>
                     <th>area geografica</th>
                </tr>
                <%
                    List<Zona> zonas =(List<Zona>) request.getAttribute("zonas");
                    if(zonas!=null){
                        for(Zona zona1:zonas){

                %>
                <tr>
                    <td><%=zona1.getId_zona() %></td>
                    <td><%=zona1.getZona() %></td>
                    <td><%=zona1.getArea_geo()%></td>
                </tr>
                <%
                        }
                    }
                %>
            </table>

</body>
</html>
