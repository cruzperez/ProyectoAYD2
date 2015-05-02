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
        //comentario     
        String titulo = "Eliminar Recurso";
        ModuloLaboratorio mlab = new ModuloLaboratorio();
        int idtiporecurso = 0;
        String nombre = "";
    %>
    <head>
        <title>Eliminar Tipo Recurso</title>
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
                        <li><a href="http://localhost:8084/ProyectoAYD2/AsignacionPrograma.html">Asignacion Programas</a></li>
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
                            </ul>
                        </div>
                    </div>

                    <div class="col_1">
                        <h1>Bienvenido!</h1>
                        <div class="box">
                            <p>Bienvenido al panel administrativo del sistema, en el cual puede modificar
                                los recursos</div>
                    </div>

                </div>

                <div class="right_section">
                    <div class="common_content">
                        <h2>Eliminar Tipo Recurso</h2>
                        <hr>

                        <TABLE BORDER>
                            <TR>
                                <TD><B>Id Tipo Recurso</TD>
                                <TD>
                                    <%
                                        ArrayList vectrecurso = mlab.obtenerTRecursos();
                                        ArrayList vectrecursonombre = mlab.obtenerTRecursosNombre();
                                        String texto = "";
                                    %>

                                    <form method="POST" name="buscar" action="">

                                        <select name="idtiporecurso">
                                            <%  for (int i = 0; i < vectrecurso.size(); i++) {
                                                    String option = (String) vectrecurso.get(i);
                                                    String option2 = (String)vectrecursonombre.get(i);
                                            %>
                                            <option value="<%= option%>"><%= option2%></option>
                                            <% } %>

                                        </select>

                                        <%
                                            if (request.getParameter("eliminar") != null) {
                                                if (request.getParameter("eliminar") != null) {
                                                    idtiporecurso = Integer.parseInt(request.getParameter("idtiporecurso"));
                                                    mlab.borrarTRecurso(idtiporecurso);
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
