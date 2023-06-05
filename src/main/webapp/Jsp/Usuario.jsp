
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.Usuario"%>
<%@ page import ="java.io.*, java.util.*"%>

<!DOCTYPE html>
<html>
<head>
    <title>Usuario Mundo Bótanico</title>
    <style>
        body {
            background-color: darkolivegreen;
            color: aliceblue;
        }
        table{
            table-layout: fixed;
            width: 100%;
            border-collapse: collapse;
            border: 3px solid purple;
        }
        thead th:nth-child(1) {
            width: 30%;
        }

        thead th:nth-child(2) {
            width: 20%;
        }

        thead th:nth-child(3) {
            width: 15%;
        }

        thead th:nth-child(4) {
            width: 35%;
        }

        th, td {
            padding: 20px;
        }
        img{
            float: right;
            margin_right:10px;
            width: 130px;
            height: 130px;
        }

    </style>
</head>
<body>
    <h1>Tabla usuarios</h1>
        <img src="imagen/" alt="logo">
    <div class="button">
        <a href="Jsp/registroUsuario.jsp" class="button">REGISTRAR</a>
    </div>

    <table>
        <thead>
            <tr>
                <th>id_usuario</th>
                <th>nombre</th>
                <th>apellido</th>
                <th>correo</th>
                <th>id_usuarioN</th>
            </tr>
        </thead>
        <tbody>
            <%
                @SuppressWarnings("unchecked")
                List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
                    if(usuarios !=null){
                        for(Usuario usuario:usuarios){
            %>
            <tr>
                <td><%=usuario.getId_usuario() %></td>
                <td><%=usuario.getNombre() %></td>
                <td><%=usuario.getApellido() %></td>
                <td><%=usuario.getCorreo() %></td>
                <td><%=usuario.getId_usuarioN() %></td>
            </tr>
               <%
                        }
                    }
            %>
        </tbody>
    </table>
</body>
</html>
