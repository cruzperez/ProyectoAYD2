<%-- 
    Document   : modificarSalon
    Created on : Mar 10, 2015, 4:07:38 PM
    Author     : cruz
--%>

<%@page import="acceso.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        Conexion miconexion = new Conexion();
        miconexion.crearConn();
        
   String titulo = miconexion.getCadena("hello world! :D");
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=titulo%></title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
</html>
