<%-- 
    Document   : index
    Created on : 4/05/2015, 02:24:51 PM
    Author     : VictorAlejandro
--%>

<%@page import="logica.ModuloLogin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        ModuloLogin login = new ModuloLogin();
        String usuario = "";
        String contrasena = "";
    %>
    <head>
        <title>Inicio</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css">
    </head>
    <body>

        <div id="wrapper"> 

            <div id="header"> 

                <div class="top_banner">
                    <h1>TechManager</h1>
                    <p>Administracion del sistema</p>
                </div>

            </div>

            <div id="page_content">

                <div class="left_side_bar">

                    <div class="col_1">
                        <h1>Bienvenido!</h1>
                        <div class="box">
                            <p>Bienvenido al panel administrativo del sistema, ingresa con tus credenciales de administrador.</p>
                        </div>
                    </div>

                </div>

                <div class="right_section">
                    <div class="common_content">
                        <h2>Ingrese sus Credenciales</h2>
                        <hr>
                        <FORM NAME="FORM1" METHOD="POST" ACTION="">
                            <%
                                if (request.getParameter("enviar") != null) {
                                    usuario = request.getParameter("nombre");
                                    contrasena = request.getParameter("contrasena");
                                    if (login.obtenerCredenciales(usuario, contrasena)) {
                                        response.sendRedirect("http://localhost:8084/ProyectoAYD2/techmanager.html");
                                    } else {
                            %> 
                            <script>alert("Nombre de usuario y/o Contrasena Incorrecta");</script> 
                            <%
                                    }
                                }

                            %>
                            <TABLE BORDER>
                                <TR>
                                    <TD><B>Nombre de Usuario / Contraseña</TD>
                                    <TD><INPUT ENGINE=TEXTBOX NAME="nombre" SIZE="20" VALUE=""></TD>
                                </TR>
                                <TR>
                                    <TD><B>Contraseña</TD>
                                    <TD><INPUT ENGINE=TEXTBOX type="password" NAME="contrasena" SIZE="20" VALUE=""></TD>
                                </TR>
                            </TABLE>
                            <P></P>
                            <INPUT TYPE="SUBMIT" NAME="enviar" VALUE="Enviar">
                        </FORM>
                        <HR>

                    </div>

                </div>

                <div class="clear"></div>



            </div>

        </div>

    </body>
</html>