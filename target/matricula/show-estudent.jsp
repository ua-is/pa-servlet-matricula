<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    String respuesta;
%>
<%
    respuesta = (String)request.getAttribute("respuesta");
%>
<html>
<head>
    <title>Show Student</title>
</head>
<body>
    <h1>Estudiante enviado</h1>
    <p><%=respuesta%></p>
</body>
</html>
