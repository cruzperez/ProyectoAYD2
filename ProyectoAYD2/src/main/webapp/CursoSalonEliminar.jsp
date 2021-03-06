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
        GestionCurso gcurso = new GestionCurso();
        int idcurso = 0;
        int idsalon = 0;
        String nombre = "";
        String nombre2 = "";
    %>
    <head>
        <title>Eliminar Recurso a Salon</title>
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
                                <li><a href="http://localhost:8084/ProyectoAYD2/agregarCurso.jsp">Agregar Curso</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/modificarCurso.jsp">Modificar Curso</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/eliminarCurso.jsp">Eliminar Curso</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/CursoSalonAgregar.jsp">Agregar Curso a Salon</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/CursoSalonModificar.jsp">Modificar Curso a Salon</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/CursoSalonEliminar.jsp">Eliminar Curso a Salon</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="col_1">
                        <h1>Bienvenido!</h1>
                        <div class="box">
                            <p>Bienvenido al panel administrativo del sistema, en el cual puede modificar
                                los cursos</div>
                    </div>

                </div>

                <div class="right_section">
                    <div class="common_content">
                        <h2>Eliminar Curso a Salon</h2>
                        <hr>
                        <FORM NAME="FORM1" METHOD="POST" ACTION="">
                        <TABLE BORDER>
                            <TR>
                                <TD><B>ID Curso/ID Salon</TD>
                                <TD>
                                    <%
                                        ArrayList vecID = gcurso.obtenerCursos();
                                        ArrayList vecNombres = gcurso.obtenerCursosNombre();
                                        ArrayList vecID2 = mlab.obtenerSalones();
                                        ArrayList vecNombres2 = mlab.obtenerSalonesNombre();

                                    %>

                                    <select name="idcurso">
                                        <%  for (int i = 0; i < vecNombres.size(); i++) {
                                                String option = (String) vecNombres.get(i);
                                                String option2 = (String) vecID.get(i);
                                        %>
                                        <option value="<%= option2%>"><%= option%></option>
                                        <% } %>

                                    </select>

                                    <select name="idsalon">
                                        <%  for (int i = 0; i < vecNombres2.size(); i++) {
                                                String option = (String) vecNombres2.get(i);
                                                String option2 = (String) vecID2.get(i);
                                        %>
                                        <option value="<%= option2%>"><%= option%></option>
                                        <% } %>

                                    </select>


                                    <%
                                        if (request.getParameter("eliminar") != null) {
                                            if (request.getParameter("eliminar") != null) {
                                                idcurso = Integer.parseInt(request.getParameter("idcurso"));
                                                idsalon = Integer.parseInt(request.getParameter("idsalon"));
                                                mlab.borrarCursoSalon(idcurso, idsalon);
                                            }
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
