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
        String titulo = "Modificar Curso";
        GestionCurso gcurso = new GestionCurso();

        int idcurso = 0;
        String nombre = "";
    %>
    <head>
        <title>Modificar Salon</title>
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
                                las configuraciones de los cursos</div>
                    </div>

                </div>

                <div class="right_section">
                    <div class="common_content">
                        <h2>Modificar Curso</h2>
                        <hr>

                        <TABLE BORDER>
                            <TR>
                                <TD><B>Id Curso</TD>
                                <TD>
                                    <%
                                        ArrayList vecCursos = gcurso.obtenerCursos();
                                        ArrayList vecNombres = gcurso.obtenerCursosNombre();
                                        String texto = "";

                                    %>

                                    <form method="POST" name="buscar" action="">

                                        <select name="idcurso">
                                            <%  for (int i = 0; i < vecCursos.size(); i++) {
                                                    String option = (String) vecCursos.get(i);
                                                    String option2 = (String) vecNombres.get(i);
                                            %>
                                            <option value="<%= option%>"><%= option2%></option>
                                            <% } %>

                                        </select>

                                        <INPUT TYPE="SUBMIT" NAME="buscar" VALUE="Buscar">
                                        <%
                                            if (request.getParameter("buscar") != null) {
                                                if (request.getParameter("buscar") != null) {

                                                    idcurso = Integer.parseInt(request.getParameter("idcurso"));
                                                    for (int i = 0; i < vecNombres.size(); i++) {
                                                        if (Integer.parseInt(vecCursos.get(i).toString()) == idcurso) {
                                                            nombre = vecNombres.get(i).toString();
                                                        }
                                                    }

                                                }
                                            }
                                            if (request.getParameter("guardar") != null) {
                                                idcurso = Integer.parseInt(request.getParameter("idcurso"));
                                                nombre = request.getParameter("nombre");
                                                gcurso.modificarCurso(idcurso, nombre);
                                            }
                                        %>  

                                        </TD>
                                        </TR>
                                        <TR>
                                            <TD><B>Nombre</TD>
                                            <TD><INPUT ENGINE=TEXTBOX NAME="nombre" SIZE="15" VALUE="<%= nombre%>"></TD>
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
