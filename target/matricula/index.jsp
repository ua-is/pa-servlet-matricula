<%--
  Created by IntelliJ IDEA.
  User: USUARIO
  Date: 9/06/2020
  Time: 00:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Estudiantes</h1>
    <form action="savestudent" method="post">
        <fieldset>
            <label for="apellidos">Apellidos: </label> <br>
            <input type="text" name="apellidos" id="apellidos"> <br>

            <label for="nombres">Nombres: </label> <br>
            <input type="text" name="nombres" id="nombres"> <br>

            <label for="edad">Edad: </label> <br>
            <input type="number" name="edad" id="edad"> <br>

            <button type="submit">Enviar</button>

        </fieldset>
    </form>
</body>
</html>
