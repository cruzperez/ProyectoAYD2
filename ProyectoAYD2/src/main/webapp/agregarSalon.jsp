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
        String titulo = "Agregar Salon";
        ModuloLaboratorio lab = new ModuloLaboratorio();
        String texto = "";
    %>
    <head>
        <title>Agregar Salon</title>
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
        <li><a href="#">Programas</a></li>
        <li><a href="http://localhost:8084/ProyectoAYD2/cursos.html">Cursos</a></li>
        <li><a href="#">Recursos</a></li>
        <li><a href="#">Asignacion Programas</a></li>
        <li><a href="#">Reservaciones</a></li>
        <li><a href="#">Reportes</a></li>
      </ul>
    </div>

    <div class="left_side_bar"> 

      <div class="col_1">
        <h1>Menu Principal</h1>
        <div class="box">
          <ul>
            <li><a href="http://localhost:8084/ProyectoAYD2/agregarSalon.jsp">Agregar Salon</a></li>
            <li><a href="http://localhost:8084/ProyectoAYD2/modificarSalon.jsp">Modificar Salon</a></li>
            <li><a href="http://localhost:8084/ProyectoAYD2/eliminarSalon.jsp">Eliminar Salon</a></li>
          </ul>
        </div>
      </div>
      
      <div class="col_1">
        <h1>Bienvenido!</h1>
        <div class="box">
          <p>Bienvenido al panel administrativo del sistema, en el cual puede modificar
          las configuraciones de labori      </div>
      </div>

    </div>

    <div class="right_section">
      <div class="common_content">
        <h2>Agregar Curso</h2>
        <hr>
        <FORM NAME="FORM1" METHOD="POST" ACTION="">
            <%
            if(request.getParameter("buscar") != null)
            {                
                texto = request.getParameter("nombre");
            }
            if(request.getParameter("guardar") != null)
            {
                texto = request.getParameter("nombre");;
            }
            %>
        
	   <TABLE BORDER>
		<TR>
		  <TD><B>Nombre</TD>
		  <TD><INPUT ENGINE=TEXTBOX NAME="nombre" SIZE="15" VALUE=""></TD>
		</TR>
		<TR>
		  <TD><B>Capacidad</TD>
                  <TD><INPUT ENGINE=TEXTBOX NAME="capacidad" SIZE="10" VALUE="<%=texto%>"></TD>
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
