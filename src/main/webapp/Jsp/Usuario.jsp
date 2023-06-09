
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.Usuario"%>
<%@ page import ="java.io.*, java.util.*"%>

<!DOCTYPE html>
<html>
<head>
    <title>Usuario Mundo Bótanico</title>
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
    <div class="button-container">
        <a href="./Jsp/registroUsuario.jsp" class="button">REGISTRAR</a>
        <a href="./Jsp/EliminarUs.jsp" class="button">ELIMINAR</a>
    </div>

    <table>
            <tr>
                <th>id_usuario</th>
                <th>nombre</th>
                <th>apellido</th>
                <th>correo</th>
                <th>id_usuarioN</th>
            </tr>
            <%
                List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
                    if(usuarios!=null){
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
    </table>
</body>
</html>
