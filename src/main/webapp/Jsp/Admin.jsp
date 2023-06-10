
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Administrador</title>
    <style>
        body {
            background-color: #5f3585;
        }
        .menu-vertical {
            list-style-type: none;
            margin: 0;
            padding: 0;
            width: 300px; /* ancho del menú */
            background-color: #aa86cb;
            font-family: Arial, sans-serif;
            font-size: x-large;
            font-style: normal;
            font-weight: 900;
            text-decoration: none;
        }
        .menu-vertical li {
            display: block;
            color: #ffffff;
            padding: 8px 16px;
            text-decoration: none;

        }
        .menu-vertical li:hover {
            background-color: #220c36;
            color: #895faf;
        }
        .header-content{
            display: flex;
            align-items: center;
            justify-content: start;
            gap: 20px;
        }
        .header-content img{
            width: 50px;
            height: 50px;
        }
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
       .header-content h1{
            text-align: center;
            color: #bbd5bd;
        }
        header {
            background-color: #220c36;
            color: #fff;
            padding: 15px;
        }

    </style>
</head>
<body>
<header>
    <div class="header-content">
    <div class="imagen-redonda">
        <img src="./imagen/cinnaicon.jpg" alt="logo">
    </div>
        <h1>Bienvenido, Administrador</h1>
    </div>

</header>

        <ul class="menu-vertical">
            <li> <a href="SvlistarUs" >Usuarios</a></li>
            <li> <a href="SvlistarPlantas">Plantas</a></li>
            <li><a href="SvListarFamilia">Familia</a> </li>
            <li><a href="SvListarZona">Zona plantas</a> </li>
            <li><a href="SvTipoPlanta">Tipos de Plantas</a> </li>
            <li><a href="SvCuidados">Cuidado de Plantas</a> </li>
            <li><a href="SvHoja">Tipo de Hojas</a> </li>
            <li><a href="SvUsPlan">Usuarios-plantas</a> </li>
            <li><a href="SvCerrarS">Cerrar sesión</a> </li>
        </ul>

</body>
</html>
