<%-- 
    Document   : modificarSalon
    Created on : Mar 10, 2015, 4:07:38 PM
    Author     : cruz
--%>

<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
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
        String fechainicio = "";
        String horainicio = "";
        String horafin = "";
        String encargado = "";
        String estado = "";
        int salon = 0;
        String idreservacion = "";
    %>
    <head>
        <title>Pre Reservacion</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css">
    </head>
    <body>

        <div id="wrapper"> 

            <div id="header"> 

                <div class="top_banner">
                    <h1>InfoTech</h1>
                    <p>Reservaciones</p>
                </div>

            </div>

            <div id="page_content">

                <div class="navigation">
                    <ul>
                        <li><a href="http://localhost:8084/ProyectoAYD2/_index.jsp">Home</a></li>
                        <li><a href="http://localhost:8084/ProyectoAYD2/contacto.html">Contacto</a></li>
                    </ul>
                </div>

                <div class="left_side_bar"> 

                    <div class="col_1">
                        <h1>Bienvenido!</h1>
                        <div class="box">
                            <p>Bienvenido al sistema de Reservaciones InfoTech</div>
                    </div>

                </div>

                <div class="right_section">
                    <div class="common_content">
                        <h2>Agregar Pre-Reservacion</h2>
                        <hr>

                        <FORM NAME="FORM1" METHOD="POST" ACTION="">
                            <article id="content">
                                <div class="wrapper">
                                    <br>
                                    <div class="row">
                                        <table border="1" style="margin: 0 auto; width:100%; border-color: #ffffff">
                                            <tr>
                                                <th style="border: #000 1px solid; margin: 0 auto; width:33%; color: #ffffff; background-color: #000">Llena el formulario siguiente y crea una solicitud la cual se deverá de presentar impresa en las oficinas para confirmar tu reservación del salón o laboratorio.</th>

                                            </tr>
                                            <tr>
                                                <td style="border: #000 1px solid; margin: 0 auto; width:33%;">
                                                    <br>
                                                    <br>
                                                    <font color="red">* Campos Obligatorios</font>
                                                    <form method="post" autocomplete="off">
                                                        <%
                                                            ArrayList vecID = mlab.obtenerSalones();
                                                            ArrayList vecNombres = mlab.obtenerSalonesNombre();
                                                            ArrayList vecID2 = mlab.obtenerReservaciones();
                                                            ArrayList vecFecha = mlab.obtenerReservacionesFecha();
                                                            ArrayList vecHoraini = mlab.obtenerReservacionesHorainicio();
                                                            ArrayList vecHoraFin = mlab.obtenerReservacionesHorafin();
                                                            ArrayList vecEncargado = mlab.obtenerReservacionesEncargado();
                                                            ArrayList vecEstado = mlab.obtenerReservacionesEstado();
                                                            ArrayList vecSalon = mlab.obtenerReservacionesSalon();

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
                                                                estado = "No Reservado";
                                                                salon = Integer.parseInt(request.getParameter("idsalon"));
                                                                mlab.reservarLaboratorio(fechainicio, horainicio, horafin, encargado, estado, salon);
                                                                vecID2 = mlab.obtenerReservaciones();
                                                                vecFecha = mlab.obtenerReservacionesFecha();
                                                                vecHoraini = mlab.obtenerReservacionesHorainicio();
                                                                vecHoraFin = mlab.obtenerReservacionesHorafin();
                                                                vecEncargado = mlab.obtenerReservacionesEncargado();
                                                                vecEstado = mlab.obtenerReservacionesEstado();
                                                                vecSalon = mlab.obtenerReservacionesSalon();
                                                                for (int i = 0; i < vecFecha.size(); i++) {
                                                                    if (vecFecha.get(i).equals(fechainicio)) {
                                                                        for (int j = 0; j < vecHoraini.size(); j++) {
                                                                            if (vecHoraini.get(j).equals(horainicio)) {
                                                                                for (int k = 0; k < vecHoraFin.size(); k++) {
                                                                                    if (vecHoraFin.get(k).equals(horafin)) {
                                                                                        for (int l = 0; l < vecSalon.size(); l++) {
                                                                                            if (Integer.parseInt(vecSalon.get(l).toString())==salon) {
                                                                                                idreservacion = vecID2.get(i).toString();
                                                                                                /*Importamos la clase "Conexion_Postgresql" y la instanciamos por el nombre conexion
                                                                                                 con la siguiente linea de codigo*/
                                                                                                //Conexion conexion = new Conexion();
                                                                                                /*Establecemos la ruta del reporte*/
                                                                                                //File reportFile = new File("D:\\Dropbox\\Análisis y Diseño de Sistemas 2\\ProyectoAYD2\\ProyectoAYD2\\src\\main\\webapp\\Reportes\\solicitud.jasper");
                                                                                                /*Enviamos parámetros porque nuestro reporte los necesita asi que escriba 
                                                                                                 y seguiremos el formato del método runReportToPdf*/
                                                                                                /*Con Map y el HaspMap nos servira para crear los paramentros*/
                                                                                                //Map parameters = new HashMap();
                                                                                                /*Capturamos el valor de nuestra formulario que es el codigo del cliente que es un
                                                                                                 varchar(5), lo almacenamos en una String*/
                                                                                                /*Digitamos la siguiente linea de codigo entre parentesis ira el parametro que agregamos en nuestro reporte
                                                                                                 llamado $P{CODIGO}, pero solo se escribira "CODIGO", el String que capturamos lo colocamos, en este caso el 
                                                                                                 reporte solo nos pide un parametro*/
                                                                                                //parameters.put("id", idreservacion);
                                                                                                /*Enviamos la ruta del reporte, los parámetros y la conexión(objeto Connection)*/
                                                                                                //byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), parameters, conexion.getConn());
                                                                                                /*Indicamos que la respuesta va a ser en formato PDF*/ 
                                                                                                //response.setContentType("application/pdf");
                                                                                                //response.setContentLength(bytes.length);
                                                                                                //ServletOutputStream ouputStream = response.getOutputStream();
                                                                                                //ouputStream.write(bytes, 0, bytes.length); /*Limpiamos y cerramos flujos de salida*/ ouputStream.flush();
                                                                                                //ouputStream.close();
                                                                                            }

                                                                                        }

                                                                                    }
                                                                                }
                                                                            }

                                                                        }
                                                                    }
                                                                }
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
