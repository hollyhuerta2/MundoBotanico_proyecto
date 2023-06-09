<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.CuidadoPlan"%>
<%@ page import ="java.io.*, java.util.*"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Cuidados de Plantas</title>
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
<h1>Tabla del Tipo de Cuidados</h1>
<%--  <div class="button-container">
       <a href="./Jsp/registroUsuario.jsp" class="button">REGISTRAR</a>
       <a href="./Jsp/EliminarUs.jsp" class="button">ELIMINAR</a>
       <a href="./Jsp/BuscarUs.jsp" class="button">MODIFICAR</a>
  </div>--%>
<table>
    <tr>
        <th>id_cuidado</th>
        <th>Tipo</th>
        <th>descripcion</th>
    </tr>
    <%
        List<CuidadoPlan> cuidadoPlans =(List<CuidadoPlan>) request.getAttribute("cuidados");
        if(cuidadoPlans!=null){
            for(CuidadoPlan cuidados:cuidadoPlans){

    %>
    <tr>
        <td><%=cuidados.getId_cuidado() %></td>
        <td><%=cuidados.getTipofk() %></td>
        <td><%=cuidados.getDescripcion()%></td>
    </tr>
    <%
            }
        }
    %>
</table>

</body>
</html>
