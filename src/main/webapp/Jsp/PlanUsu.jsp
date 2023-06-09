<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.Planta_Us"%>
<%@ page import ="java.io.*, java.util.*"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Plantas-Usuarios</title>
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
<h1>Tabla de Plantas de Usuarios</h1>
<%--  <div class="button-container">
       <a href="./Jsp/registroUsuario.jsp" class="button">REGISTRAR</a>
       <a href="./Jsp/EliminarUs.jsp" class="button">ELIMINAR</a>
       <a href="./Jsp/BuscarUs.jsp" class="button">MODIFICAR</a>
  </div>--%>
      <table>
        <tr>
           <th>id_planus</th>
           <th>Usuario</th>
           <th>plantas</th>
        </tr>
         <%
             List<Planta_Us> plantaUses =(List<Planta_Us>) request.getAttribute("UsPlan");
                 if(plantaUses!=null){
                    for(Planta_Us plan:plantaUses){

         %>
           <tr>
               <td><%=plan.getId_planus() %></td>
               <td><%=plan.getUsuariofk() %></td>
                <td><%=plan.getPlantasfk()%></td>
           </tr>
       <%
                   }
               }
       %>
</table>

</body>
</html>
