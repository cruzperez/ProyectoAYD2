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
        String titulo = "Eliminar Salon";
        ModuloLaboratorio lab = new ModuloLaboratorio();
        
        int idsalon = 0;
        int capacidad = 0;
        String nombre = "";
    %>
    <head>
        <title><%=titulo%></title>
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
        <h2>Eliminar Salon</h2>
        <hr>
        
        <TABLE BORDER>
               <TR>
		  <TD><B>Id Salon</TD>
		  <TD>
        <%
            /*
            ArrayList al = new ArrayList();
            al.add("C");
            al.add("A");
            al.add("E");
            al.add("B");
            al.add("D");
            al.add("F");
            */            
            ArrayList vecSalones = lab.obtenerSalones();
            ArrayList vecNombres = lab.obtenerSalonesNombre();
            ArrayList vecCapacidades = lab.obtenerSalonesCapacidad();
            String texto = "";

        %>

        <form method="POST" name="buscar" action="">
            
<select name="idsalon">
   <%  for(int i = 0; i < vecSalones.size(); i++) {
           String option = (String)vecSalones.get(i);
   %>
   <option value="<%= option %>"><%= option %></option>
   <% } %>
   
    </select>
   
   <INPUT TYPE="SUBMIT" NAME="buscar" VALUE="Buscar">
        <%
            if(request.getParameter("buscar") != null)
            {                
                idsalon = Integer.parseInt(request.getParameter("idsalon"));
                for (int i=0; i<vecNombres.size(); i++){
                    if(Integer.parseInt(vecSalones.get(i).toString()) == idsalon){
                        nombre = vecNombres.get(i).toString();
                        capacidad = Integer.parseInt(vecCapacidades.get(i).toString());
                    }
                }
                
            }
            if(request.getParameter("eliminar") != null)
            {
                idsalon = Integer.parseInt(request.getParameter("idsalon"));
                lab.borrarSalon(idsalon);
            }
        %> 
   
                  </TD>
		</TR>
		<TR>
		  <TD><B>Nombre</TD>
                  <TD><INPUT ENGINE=TEXTBOX NAME="nombre" SIZE="15" VALUE="<%= nombre %>"></TD>
		</TR>
		<TR>
		  <TD><B>Capacidad</TD>
                  <TD><INPUT ENGINE=TEXTBOX NAME="capacidad" SIZE="10" VALUE="<%= capacidad %>"></TD>
		</TR>
	   </TABLE>
	   <P></P>           
                <INPUT TYPE="SUBMIT" NAME="eliminar" VALUE="Eliminar">
	   <HR></HR>
         </form>
        
        </div>
      
    </div>

    <div class="clear"></div>
    
    
        
  </div>

</div>
        
</html>
