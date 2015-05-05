<%-- 
    Document   : solicitudpdf
    Created on : 5/05/2015, 02:05:02 AM
    Author     : VictorAlejandro
--%>

<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="acceso.Conexion"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%  /*Importamos la clase "Conexion_Postgresql" y la instanciamos por el nombre conexion
con la siguiente linea de codigo*/
Conexion conexion=new Conexion();
/*Establecemos la ruta del reporte*/ 
File reportFile = new File(application.getRealPath("Reportes/solicitud.jasper"));
/*Enviamos parámetros porque nuestro reporte los necesita asi que escriba 
y seguiremos el formato del método runReportToPdf*/ 
/*Con Map y el HaspMap nos servira para crear los paramentros*/
Map parameters = new HashMap();
/*Capturamos el valor de nuestra formulario que es el codigo del cliente que es un
varchar(5), lo almacenamos en una String*/
String idcliente=request.getParameter("idreservacion");
/*Digitamos la siguiente linea de codigo entre parentesis ira el parametro que agregamos en nuestro reporte
llamado $P{CODIGO}, pero solo se escribira "CODIGO", el String que capturamos lo colocamos, en este caso el 
reporte solo nos pide un parametro*/
parameters.put("id", idcliente); 
/*Enviamos la ruta del reporte, los parámetros y la conexión(objeto Connection)*/ 
byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath (), parameters, conexion.getConn()); 
/*Indicamos que la respuesta va a ser en formato PDF*/ response.setContentType("application/pdf");
response.setContentLength(bytes.length); ServletOutputStream ouputStream = response.getOutputStream(); 
ouputStream.write(bytes, 0, bytes.length); /*Limpiamos y cerramos flujos de salida*/ ouputStream.flush(); 
ouputStream.close(); %>