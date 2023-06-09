<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.TipoHoja"%>
<%@ page import ="java.io.*, java.util.*"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Tipo de Hoja</title>
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
<h1>Tabla del Tipo de Hoja</h1>
<%--  <div class="button-container">
       <a href="./Jsp/registroUsuario.jsp" class="button">REGISTRAR</a>
       <a href="./Jsp/EliminarUs.jsp" class="button">ELIMINAR</a>
       <a href="./Jsp/BuscarUs.jsp" class="button">MODIFICAR</a>
  </div>--%>
<table>
    <tr>
        <th>id_hoja</th>
        <th>tipo hoja</th>
        <th>descripcion</th>
    </tr>
    <%
        List<TipoHoja> tipohoja =(List<TipoHoja>) request.getAttribute("hojas");
        if(tipohoja!=null){
            for(TipoHoja hojas:tipohoja){

    %>
    <tr>
        <td><%=hojas.getId_hoja() %></td>
        <td><%=hojas.getTipoh() %></td>
        <td><%=hojas.getDescripcion()%></td>
    </tr>
    <%
            }
        }
    %>
</table>

</body>
</html>
