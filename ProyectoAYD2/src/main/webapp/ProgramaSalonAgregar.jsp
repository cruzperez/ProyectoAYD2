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
        String titulo = "Agregar Software";
        ModuloProgramas mprogramas = new ModuloProgramas();
        ModuloLaboratorio mlab = new ModuloLaboratorio();
        int idprograma = 0;
        int idsalon = 0;
        String nombre = "";
        String nombre2 = "";
    %>
    <head>
        <title>Agregar Programa a Salon</title>
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
                                <li><a href="http://localhost:8084/ProyectoAYD2/ProgramaAgregar.jsp">Agregar Software</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/ProgramaModificar.jsp">Modificar Software</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/ProgramaEliminar.jsp">Eliminar Software</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/ProgramaSalonAgregar.jsp">Agregar Software a Salon</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/ProgramaSalonModificar.jsp">Modificar Software a Salon</a></li>
                                <li><a href="http://localhost:8084/ProyectoAYD2/ProgramaSalonEliminar.jsp">Eliminar Software a Salon</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="col_1">
                        <h1>Bienvenido!</h1>
                        <div class="box">
                            <p>Bienvenido al panel administrativo del sistema, en el cual puede modificar
                                las configuraciones de software</div>
                    </div>

                </div>

                <div class="right_section">
                    <div class="common_content">
                        <h2>Agregar Programa a Salon</h2>
                        <hr>

                        <FORM NAME="FORM1" METHOD="POST" ACTION="">
                            <%
                                ArrayList vecID = mprogramas.obtenerProgramas();
                                ArrayList vecNombres = mprogramas.obtenerProgramasNombre();
                                ArrayList vecID2 = mlab.obtenerSalones();
                                ArrayList vecNombres2 = mlab.obtenerSalonesNombre();

                            %>
                            <TABLE BORDER>
                                <TR>
                                    <TD><B>ID Programa</TD>

                                    <TD>
                                        <select name="idprograma">
                                            <%  for (int i = 0; i < vecID.size(); i++) {
                                                    String option = (String) vecNombres.get(i);
                                                    String option2 = (String)vecID.get(i);
                                            %>
                                            <option value="<%= option2%>"><%= option%></option>
                                            <% }%>
                                        </select>
                                    </TD>
                                </TR>
                                <TR>
                                    <TD><B>ID Salon</TD>

                                    <TD>
                                        <select name="idsalon">
                                            <%  for (int i = 0; i < vecID2.size(); i++) {
                                                    String option = (String) vecNombres2.get(i);
                                                    String option2 = (String)vecID2.get(i);
                                            %>
                                            <option value="<%= option2%>"><%= option%></option>
                                            <% }%>
                                        </select>
                                    </TD>
                                    <%  if (request.getParameter("guardar") != null) {

                                            idprograma = Integer.parseInt(request.getParameter("idprograma"));
                                            for (int i = 0; i < vecNombres.size(); i++) {
                                                if (Integer.parseInt(vecID.get(i).toString()) == idprograma) {
                                                    nombre = vecNombres.get(i).toString();
                                                    idprograma = Integer.parseInt(vecID.get(i).toString());
                                                }
                                            }
                                            
                                            idsalon = Integer.parseInt(request.getParameter("idsalon"));
                                            for (int i = 0; i < vecNombres2.size(); i++) {
                                                if (Integer.parseInt(vecID2.get(i).toString()) == idsalon) {
                                                    nombre2 = vecNombres2.get(i).toString();
                                                    idsalon = Integer.parseInt(vecID2.get(i).toString());
                                                }
                                            }
                                            mprogramas.nuevoProgramaSalon(""+idprograma, ""+idsalon);
                                        }
                                    %>
                                </TR>
                            </TABLE>
                            <P></P>
                            <INPUT TYPE="SUBMIT" NAME="guardar" VALUE="Guardar">
                            <HR></HR>
                        </FORM>
                        <HR></HR>


                    </div>

                </div>

                <div class="clear"></div>



            </div>

        </div>

</html>
