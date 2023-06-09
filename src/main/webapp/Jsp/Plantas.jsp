<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.Plantas"%>
<%@ page import ="java.io.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
    <title>Plantas</title>
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
    <h1>Tabla usuarios</h1>
  <%--  <div class="button-container">
         <a href="./Jsp/registroUsuario.jsp" class="button">REGISTRAR</a>
         <a href="./Jsp/EliminarUs.jsp" class="button">ELIMINAR</a>
         <a href="./Jsp/BuscarUs.jsp" class="button">MODIFICAR</a>
    </div>--%>

   <table>
       <tr>
           <th>id_planta</th>
           <th>nombre_com</th>
           <th>nombre_cient</th>
           <th>tipofk</th>
           <th>tipohojafk</th>
           <th>zonafk</th>
           <th>familiafk</th>
       </tr>
       <%
           List<Plantas> plantas = (List<Plantas>) request.getAttribute("plantas");
           if(plantas!=null){
               for(Plantas plantas1:plantas){
       %>
       <tr>
           <td><%=plantas1.getId_planta() %></td>
           <td><%=plantas1.getNombre_com() %></td>
           <td><%=plantas1.getNombre_cient()%></td>
           <td><%=plantas1.getTipofk() %></td>
           <td><%=plantas1.getTipohojafk() %></td>
           <td><%=plantas1.getZonafk() %></td>
           <td><%=plantas1.getFamiliafk() %></td>
       </tr>
       <%
               }
           }
       %>
   </table>

</body>
</html>
