<%-- 
    Document   : modificarSalon
    Created on : Mar 10, 2015, 4:07:38 PM
    Author     : cruz
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Vector"%>
<%@page import="acceso.Conexion"%>
<%@page import="vista.*"%>
<%@page import="logica.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String titulo = "Agregar Reservacion";
        ModuloLaboratorio mlab = new ModuloLaboratorio();
        String fechainicio = "";
        String horainicio = "";
        String horafin = "";
        String encargado = "";
        String estado = "";
        int salon = 0;
        
    %>
    <head>
        <title>Agregar Programa</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css">
        <title><%=titulo%></title>
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
                                las reservas</div>
                    </div>

                </div>

                <div class="right_section">
                    <div class="common_content">
                        <h2>Agregar Reservacion</h2>
                        <hr>

                        <FORM NAME="FORM1" METHOD="POST" ACTION="">
                            <article id="content">
                                <div class="wrapper">
                                    <br>
                                    <div class="row">
                                        <table border="1" style="margin: 0 auto; width:100%; border-color: #ffffff">
                                            <tr>
                                                <td style="border: #000 1px solid; margin: 0 auto; width:33%;">
                                                    <br>
                                                    <br>
                                                    <font color="red">* Campos Obligatorios</font>
                                                    <form method="post" autocomplete="off">
                                                        <%
                                                            ArrayList vecID = mlab.obtenerSalones();
                                                            ArrayList vecNombres = mlab.obtenerSalonesNombre();

                                                        %>
                                                        <center>
                                                            <div class="grid_12">
                                                                <table style="border: #000 1px solid; margin: 0 auto; width:100%;">
                                                                    <tr>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color: #FFFFFF">
                                                                            Listado de salones/Laboratorios
                                                                        </th>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color: #FFFFFF">
                                                                            [<select name="idsalon">
                                                                                <%  for (int i = 0; i < vecNombres.size(); i++) {
                                                                                        String option = (String) vecNombres.get(i);
                                                                                        String option2 = (String) vecID.get(i);
                                                                                %>
                                                                                <option value="<%= option2%>"><%= option%></option>
                                                                                <% } %>

                                                                            </select>]<font color="red"> *</font>
                                                                        </th>
                                                                    </tr>
                                                                    <tr>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color: #FFFFFF">
                                                                            Fecha de Reservación
                                                                        </th>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color: #FFFFFF">
                                                                            [<input type="date" name="fecha" required>] <font color="red">*</font>
                                                                        </th>
                                                                    </tr>
                                                                    <tr>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color: #FFFFFF">
                                                                            Hora de Inicio
                                                                        </th>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color: #FFFFFF">
                                                                            [<input type="time" name="horainicio" required>] <font color="red">*</font> 
                                                                        </th>
                                                                    </tr>
                                                                    <tr>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color: #FFFFFF">
                                                                            Hora de Finalización
                                                                        </th>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color: #FFFFFF">
                                                                            [<input type="time" name="horafin" required>] <font color="red">*</font>
                                                                        </th>
                                                                    </tr>
                                                                    <tr>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color:#FFFFFF">
                                                                            Nombre Solicitante
                                                                        </th>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color: #FFFFFF">
                                                                            [<input type="text" name="encargado" required>] <font color="red">*</font>
                                                                        </th>
                                                                    </tr>
                                                                    <tr>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color: #FFFFFF">
                                                                            Estado de Reservacion
                                                                        </th>
                                                                        <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #000; background-color: #FFFFFF">
                                                                            [<select name="estado">
                                                                                <%                                                                                    ArrayList vec = new ArrayList();
                                                                                    vec.add("No Reservado");
                                                                                    vec.add("Reservado");
                                                                                    for (int i = 0; i < vec.size(); i++) {
                                                                                        String option = (String) vec.get(i);
                                                                                %>
                                                                                <option value="<%= option%>"><%= option%></option>
                                                                                <% }%>

                                                                            </select>]<font color="red"> *</font>
                                                                        </th>
                                                                    </tr>
                                                                </table>
                                                            </div>
                                                        </center>
                                                        <INPUT TYPE="SUBMIT" NAME="enviar" VALUE="Enviar">
                                                        <%
                                                            if (request.getParameter("enviar") != null) {
                                                                fechainicio = request.getParameter("fecha");
                                                                horainicio = request.getParameter("horainicio");
                                                                horafin = request.getParameter("horafin");
                                                                encargado = request.getParameter("encargado");
                                                                estado = request.getParameter("estado");
                                                                salon = Integer.parseInt(request.getParameter("idsalon"));
                                                                mlab.reservarLaboratorio(fechainicio, horainicio, horafin, encargado, estado, salon);
                                                                
                                                            }
                                                        %>
                                                    </form>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </div>
                        </FORM>
                        <HR></HR>


                    </div>

                </div>

                <div class="clear"></div>



            </div>

        </div>

</html>
