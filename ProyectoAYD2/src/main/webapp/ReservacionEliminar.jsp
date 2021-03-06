<%-- 
    Document   : modificarSalon
    Created on : Mar 10, 2015, 4:07:38 PM
    Author     : cruz
--%>

<%@page import="acceso.GestionPrograma"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Vector"%>
<%@page import="acceso.Conexion"%>
<%@page import="vista.*"%>
<%@page import="logica.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        ModuloLaboratorio mlab = new ModuloLaboratorio();
        int idreserva = 0;
    %>
    <head>
        <title>Eliminar Reservacion</title>
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

                <div class="navigation">
                    <ul>
                        <li><a href="http://localhost:8084/ProyectoAYD2">Home</a></li>
                        <li><a href="http://localhost:8084/ProyectoAYD2/salones.html">Salones</a></li>
                        <li><a href="http://localhost:8084/ProyectoAYD2/Programas.html">Programas</a></li>
                        <li><a href="http://localhost:8084/ProyectoAYD2/cursos.html">Cursos</a></li>
                        <li><a href="http://localhost:8084/ProyectoAYD2/Recurso.html">Recursos</a></li>
                        <li><a href="http://localhost:8084/ProyectoAYD2/Reservacion.html">Reservaciones</a></li>
                        <li><a href="http://localhost:8084/ProyectoAYD2/Reporte.html">Reportes</a></li>
                    </ul>
                </div>

                <div class="left_side_bar"> 

                    <div class="col_1">
                        <h1>Menu Principal</h1>
                        <div class="box">
                            <ul>
                                <li><a href="http://localhost:8084/ProyectoAYD2/ReservacionAgregar.jsp">Agregar Reserva</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/ReservacionModificar.jsp">Modificar Reserva</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/ReservacionEliminar.jsp">Eliminar Reserva</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="col_1">
                        <h1>Bienvenido!</h1>
                        <div class="box">
                            <p>Bienvenido al panel administrativo del sistema, en el cual puede modificar
                                las reservaciones</div>
                    </div>

                </div>

                <div class="right_section">
                    <div class="common_content">
                        <h2>Eliminar Reservacion</h2>
                        <hr>

                        <TABLE BORDER>
                            <TR>
                                <TD><B>Id Reservacion</TD>
                                <TD>
                                    <%
                                        ArrayList vecID = mlab.obtenerReservaciones();

                                    %>

                                    <form method="POST" name="eliminar" action="">

                                        <select name="idreservacion">
                                            <%  for (int i = 0; i < vecID.size(); i++) {
                                                    String option = (String) vecID.get(i);
                                            %>
                                            <option value="<%= option%>"><%= option%></option>
                                            <% } %>

                                        </select>


                                        <%
                                                if (request.getParameter("eliminar") != null) {
                                                    idreserva = Integer.parseInt(request.getParameter("idreservacion"));
                                                    mlab.borrarReservacion(idreserva);
                                                }
                                        %>

                                        </TD>
                                        </TR>

                        </TABLE>
                        <P></P>

                        <INPUT TYPE="SUBMIT" NAME="eliminar" VALUE="Eliminar">

                        </form>
                        <HR></HR>


                    </div>

                </div>

                <div class="clear"></div>



            </div>

        </div>



</html>
