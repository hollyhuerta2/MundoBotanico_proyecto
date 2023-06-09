<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.TipoPlanta"%>
<%@ page import ="java.io.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
    <title>Tipo de Plantas</title>
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
<h1>Tabla del Tipo de Plantas</h1>
<%--  <div class="button-container">
       <a href="./Jsp/registroUsuario.jsp" class="button">REGISTRAR</a>
       <a href="./Jsp/EliminarUs.jsp" class="button">ELIMINAR</a>
       <a href="./Jsp/BuscarUs.jsp" class="button">MODIFICAR</a>
  </div>--%>
<table>
    <tr>
        <th>id_TipoPlantas</th>
        <th>Tipo</th>
        <th>descripcion</th>
    </tr>
    <%
        List<TipoPlanta> tipoPlantas =(List<TipoPlanta>) request.getAttribute("tipoplantas");
        if(tipoPlantas!=null){
            for(TipoPlanta tipoPlanta:tipoPlantas){

    %>
    <tr>
        <td><%=tipoPlanta.getId_tipo() %></td>
        <td><%=tipoPlanta.getTipo() %></td>
        <td><%=tipoPlanta.getDescripcion()%></td>
    </tr>
    <%
            }
        }
    %>
</table>

</body>
</html>
