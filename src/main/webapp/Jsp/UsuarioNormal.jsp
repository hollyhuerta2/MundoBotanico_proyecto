
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Bienvenido, Usuario</title>
    <style>
        body {
            background-color: #5ed556;
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
        .header-content h4{
            text-align: center;
            color: #bbd5bd;
        }
        header {
            background-color: #193d0c;
            color: #fff;
            padding: 15px;
        }
        .dropdown {
            position: relative;
            display: inline-block;
        }

        /* Estilo del menú desplegable */
        .dropdown-content {
            display: none;
            position: absolute;
            min-width: 160px;
            z-index: 1;
            list-style-type: none;
            margin: 0;
            padding: 0;
            width: 300px;
            background-color: #235411;
            font-size: x-large;
            font-style: normal;
            font-weight: 900;
            text-decoration: none;
        }
        /* Estilo de los elementos del menú desplegable */
        .dropdown-content a {
            color: #ffffff;
            padding: 12px 16px;
            text-decoration: none;
            display: block;

        }
        /* Muestra el menú desplegable al pasar el mouse */
        .dropdown:hover .dropdown-content {
            display: block;
        }
        /* Estilo del icono */
        .icon {
            height: 48px;
            width: 48px;
        }
        section {
            background-color: #42963d;
            margin: 10px;
            padding: 20px;
            border-radius: 10px;
            text-align: center;
        }
       nav{
           display: flex;
           flex-direction: row;
           background-color: #306b19;
       }
       h2{
           text-align: center;
           color: #ffffff;
       }
       p{
           color: #ffffff;
       }
    </style>
</head>
<body>
<header>
    <div class="header-content">

        <div class="imagen-redonda">
            <img src="./imagen/MundoBotanico.png" alt="logo">
        </div>
            <h1>¡Bienvenido a Mundo Botánico!</h1>
        </div>
</header>
<nav>
    <div class="header-content">
        <div class="dropdown">
          <img src="./imagen/flor-de-loto.png" class="icon">
         <div class="dropdown-content">
             <a  href="ServletInforma">Plantas Información</a>
              <a href="SvMostrarPlan">Plantas Tabla de contenido</a>
              <a href="SvBusZona">Zonas</a>
              <a href="SvMostrarFamilia">Familias</a>
             <a href="SvMostrarHoja">Tipo Hoja</a>
             <a href="SvMostrarTP">Tipo Plantas</a>
             <a href="SvMostrarCuidados">Cuidados Plantas</a>
             <a href="ServletGalery">Galería</a>
<%--             <a href="ServletNuevoUS">No tienes cuenta? REGISTRATE</a>--%>
             <a href="SvCerrarS">cerrar sesión</a>
         </div>
        </div>
        <h4>menú</h4>
    </div>
</nav>

<section>
    <h2>MUNDO BOTÁNICO</h2>
    <p>AMA Y PROTEGE </p>
    <p>"Si realmente amas la naturaleza,</p>
         <p>encontrás belleza</p>
         <p>en todas partes."</p>
         <p>-Vicent Van Gogh-</p>
    <img src="./imagen/MundoBotanico.png" alt="logo">
</section>


</body>
</html>
