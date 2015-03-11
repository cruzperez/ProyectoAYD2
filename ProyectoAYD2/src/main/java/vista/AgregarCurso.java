/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import acceso.Conexion;

/**
 *
 * @author cruz
 */
@WebServlet(name = "AgregarCurso", urlPatterns = {"/AgregarCurso"})
public class AgregarCurso extends HttpServlet {

    private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// Obtenemos un objeto Print Writer para enviar respuesta
            
            Conexion miconexion = new Conexion();
            
            /*
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<HTML><HEAD><TITLE>Leyendo parámetros</TITLE></HEAD>");
		pw.println("<BODY BGCOLOR=\"#CCBBAA\">");
		pw.println("<H2>Leyendo parámetros desde un formulario html</H2><P>");
		pw.println("<UL>\n");
		pw.println("Salon de " + req.getParameter("nombre") + "<BR>");
		pw.println("con capacidad de "  + req.getParameter("capacidad") + " personas<BR>");
                pw.println("Respuesta: " + miconexion.getCadena(req.getParameter("nombre") + req.getParameter("capacidad")));
                pw.println("<a href = \"http://localhost:8084/ProyectoAYD2/agregarSalon.html\">Regresar</a>");
		pw.println("</BODY></HTML>");
		pw.close();
            */
            //String dire=req.getParameter("direccion");
            res.sendRedirect("http://localhost:8084/ProyectoAYD2/agregarCurso.jsp");
	}
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Salones</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Salones at " + request.getContextPath() + "</h1>");            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        
    }
    
    /*
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    // Obtenemos un objeto Print Writer para enviar respuesta
		
                
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
