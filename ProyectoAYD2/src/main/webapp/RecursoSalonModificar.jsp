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
        ModuloLaboratorio mlab = new ModuloLaboratorio();
        int idRecurso = 0;
        int idsalon = 0;
        int idRecurso2 = 0;
        int idsalon2 = 0;
        int capacidad = 0;
        String nombre = "";
        String nombre2 = "";
    %>
    <head>
        <title>Modificar Recurso a Salon</title>
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
                                <li><a href="http://localhost:8084/ProyectoAYD2/TipoRecursoAgregar.jsp">Agregar Tipo Recurso</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/TipoRecursoModificar.jsp">Modificar Tipo Recurso</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/TipoRecursoEliminar.jsp">Eliminar Tipo Recurso</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/RecursoAgregar.jsp">Agregar Recurso</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/RecursoModificar.jsp">Modificar Recurso</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/RecursoEliminar.jsp">Eliminar Recurso</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/RecursoSalonAgregar.jsp">Agregar Recurso a Salon</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/RecursoSalonModificar.jsp">Modificar Recurso a Salon</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/RecursoSalonEliminar.jsp">Eliminar Recurso a Salon</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="col_1">
                        <h1>Bienvenido!</h1>
                        <div class="box">
                            <p>Bienvenido al panel administrativo del sistema, en el cual puede modificar
                                los Recursos    </div>
                    </div>

                </div>

                <div class="right_section">
                    <div class="common_content">
                        <h2>Modificar Recursos</h2>
                        <hr>

                        <TABLE BORDER>
                            <TR>
                                <TD><B>ID Recurso/ID Salon</TD>
                                <TD>
                                    <%
                                        ArrayList vecID = mlab.obtenerRecursos();
                                        ArrayList vecNombres = mlab.obtenerRecursosNombre();
                                        ArrayList vecID2 = mlab.obtenerSalones();
                                        ArrayList vecNombres2 = mlab.obtenerSalonesNombre();
                                    %>

                                    <form method="POST" name="buscar" action="">

                                        <select name="idrecurso">
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



                                        <INPUT TYPE="SUBMIT" NAME="buscar" VALUE="Buscar">
                                        <%
                                            if (request.getParameter("buscar") != null) {
                                                idRecurso = Integer.parseInt(request.getParameter("idrecurso"));
                                                for (int i = 0; i < vecNombres.size(); i++) {
                                                    if (Integer.parseInt(vecID.get(i).toString()) == idRecurso) {
                                                        nombre = vecNombres.get(i).toString();
                                                    }
                                                }
                                                idsalon = Integer.parseInt(request.getParameter("idsalon"));
                                                for (int i = 0; i < vecNombres2.size(); i++) {
                                                    if (Integer.parseInt(vecID2.get(i).toString()) == idsalon) {
                                                        nombre2 = vecNombres2.get(i).toString();
                                                    }
                                                }

                                            }

                                            if (request.getParameter("eliminar") != null) {
                                                idRecurso = Integer.parseInt(request.getParameter("idrecurso"));
                                                idsalon = Integer.parseInt(request.getParameter("idsalon"));
                                                idRecurso2 = Integer.parseInt(request.getParameter("idrecurso2"));
                                                idsalon2 = Integer.parseInt(request.getParameter("idsalon2"));
                                                capacidad = Integer.parseInt(request.getParameter("capacidad"));
                                                mlab.modificarRecursoSalon(idRecurso, idsalon, idRecurso2, idsalon2,capacidad);
                                            }

                                        %>  

                                        </TD>
                                        </TR>
                                        <TR>
                                            <TD><B>Modificar Recurso</TD>
                                            <TD>
                                                <select name="idrecurso2">
                                                    <%  for (int i = 0; i < vecNombres.size(); i++) {
                                                            String option = (String) vecNombres.get(i);
                                                    %>
                                                    <option value="<%= option%>"><%= option%></option>
                                                    <% }%>

                                                </select>
                                            </TD>
                                        </TR>
                                        <TR>
                                            <TD><B>Modificar Salon</TD>
                                            <TD>
                                                <select name="idsalon2">
                                                    <%  for (int i = 0; i < vecNombres2.size(); i++) {
                                                            String option = (String) vecNombres2.get(i);
                                                    %>
                                                    <option value="<%= option%>"><%= option%></option>
                                                    <% }%>

                                                </select>
                                            </TD>
                                        </TR>
                                        <TR>
                                            <TD><B>Cantidad</TD>
                                            <TD><INPUT ENGINE=TEXTBOX NAME="capacidad" SIZE="15" VALUE="<%=capacidad%>"></TD>
                                        </TR>
                        </TABLE>
                        <P></P>

                        <INPUT TYPE="SUBMIT" NAME="guardar" VALUE="Guardar">

                        </form>
                        <HR></HR>


                    </div>

                </div>

                <div class="clear"></div>



            </div>

        </div>

</html>
