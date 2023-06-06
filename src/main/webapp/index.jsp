
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mundo Bótanico</title>
    <link href="css/estilo.css" rel="stylesheet" type="text/css">
   <%-- <script>
        function iniciarSesion(){
            var form = document.getElementById("formulario");
            form.action = "/SvUsuarios";
            form.submit();
        }
    </script>--%>
</head>
<body>
    <div id="cuadro">
      <form action="SvUsuarios" method="post">
        <p id="titulo">INICIAR SESIÓN</p>
        <hr>
        <br/><br/>
        <label id="subtitulo1">NOMBRE</label>
        <br/><br/>
        <input type="text" class="entrada" name="nombre"/>
        <br/><br/>
        <label id="subtitulo2">NOMBRE USUARIO</label>
        <br/><br/>
        <input type="text" class="entrada" name="nombreUsuario"/>
        <br/><br/>
          <input type="submit" value="Iniciar sesión" id="boton"/>
          <input type="reset"/>

      </form>
      <br/>
      <p id="marca">Welcome</p>
    </div>
</body>
</html>
