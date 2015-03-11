<%-- 
    Document   : modificarSalon
    Created on : Mar 10, 2015, 4:07:38 PM
    Author     : cruz
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Vector"%>
<%@page import="acceso.Conexion"%>
<%@page import="vista.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        Conexion miconexion = new Conexion();
        miconexion.crearConn();
   //comentario     
   String titulo = miconexion.getCadena("hello world! :D");
    %>
    <head>
        <title>Inicio</title>
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
        <li><a href="#">Cursos</a></li>
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
            <li><a href="http://localhost:8084/ProyectoAYD2/agregarSalon.html">Agregar Salon</a></li>
            <li><a href="http://localhost:8084/ProyectoAYD2/modificarSalon.jsp">Modificar Salon</a></li>
            <li><a href="#">Eliminar Salon</a></li>
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
        <h2>Modificar Salon</h2>
        <hr>
        
        <TABLE BORDER>
               <TR>
		  <TD><B>Id Salon</TD>
		  <TD>
        <%

            ArrayList al = new ArrayList();
            al.add("C");
            al.add("A");
            al.add("E");
            al.add("B");
            al.add("D");
            al.add("F");
            
            String texto = "";

        %>

<select>
   <%  for(int i = 0; i < al.size(); i++) {
           String option = (String)al.get(i);
   %>
   <option value="<%= option %>"><%= option %></option>
   <% } %>
   
    </select>
   <form method="POST" name="buscar" action="">
   <INPUT TYPE="SUBMIT" NAME="buscar" VALUE="Buscar">
        <%
            if(request.getParameter("buscar") != null)
            {
                texto = al.get(3).toString();
            }
            if(request.getParameter("guardar") != null)
            {
                texto = al.get(0).toString();
            }
        %>
    </form>
   
                  </TD>
		</TR>
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
           <form method="POST" name="guardar" action="">
                <INPUT TYPE="SUBMIT" NAME="guardar" VALUE="Guardar">
                
           </form>
	   <HR></HR>
         
        
        </div>
      
    </div>

    <div class="clear"></div>
    
    
        
  </div>

</div>
        
</html>
