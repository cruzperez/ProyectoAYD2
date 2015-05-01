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
        //comentario     
        String titulo = "Modificar Recurso";
        ModuloLaboratorio mlab = new ModuloLaboratorio();
        int idtiporecurso = 0;
        int id = 0;
        String nombre = "";
    %>
    <head>
        <title>Modificar Recurso</title>
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
                                los recursos    </div>
                    </div>

                </div>

                <div class="right_section">
                    <div class="common_content">
                        <h2>Modificar Recurso</h2>
                        <hr>

                        <TABLE BORDER>
                            <TR>
                                <TD><B>Id Recurso</TD>
                                <TD>
                                    <%
                                        ArrayList vecID = mlab.obtenerRecursos();
                                        ArrayList vecNombres = mlab.obtenerRecursosNombre();
                                        String texto = "";

                                    %>

                                    <form method="POST" name="buscar" action="">

                                        <select name="idrecurso">
                                            <%  for (int i = 0; i < vecID.size(); i++) {
                                                    String option = (String) vecID.get(i);
                                            %>
                                            <option value="<%= option%>"><%= option%></option>
                                            <% } %>

                                        </select>

                                        <INPUT TYPE="SUBMIT" NAME="buscar" VALUE="Buscar">
                                        <%
                                            if (request.getParameter("buscar") != null) {
                                                if (request.getParameter("buscar") != null) {

                                                    idtiporecurso = Integer.parseInt(request.getParameter("idrecurso"));
                                                    for (int i = 0; i < vecNombres.size(); i++) {
                                                        if (Integer.parseInt(vecID.get(i).toString()) == idtiporecurso) {
                                                            nombre = vecNombres.get(i).toString();
                                                        }
                                                    }

                                                }
                                            }
                                            if (request.getParameter("guardar") != null) {
                                                idtiporecurso = Integer.parseInt(request.getParameter("idtiporecurso"));
                                                id = Integer.parseInt(request.getParameter("idrecurso"));
                                                nombre = request.getParameter("nombre");
                                                mlab.modificarRecurso(id, nombre, idtiporecurso);
                                            }
                                        %>  

                                        </TD>
                                        </TR>
                                        <TR>
                                            <TD><B>Nombre</TD>
                                            <TD><INPUT ENGINE=TEXTBOX NAME="nombre" SIZE="15" VALUE="<%= nombre%>"></TD>
                                        </TR>
                                        <TR>
                                            <TD><B>ID Tipo Recurso</TD>

                                            <TD>
                                                <select name="idtiporecurso">
                                                    <%  for (int i = 0; i < vecID.size(); i++) {
                                                            String option = (String) vecNombres.get(i);
                                                    %>
                                                    <option value="<%= option%>"><%= option%></option>
                                                    <% }%>
                                                </select>
                                            </TD>
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
