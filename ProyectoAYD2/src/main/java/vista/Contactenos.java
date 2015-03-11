/*
 * To change this template, choose Tools | Templates
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
import logica.*;

/**
 *
 * @author cruz
 */
@WebServlet(name = "Contactenos", urlPatterns = {"/Contactenos"})
public class Contactenos extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println(
                "<html>\n" +
                "<head><title>Contactenos" + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">Contactenos" + "</h1>\n" +
                "<form name=\"loginForm\" method=\"post\" action=\"Contactenos\">"+
                "Tu Correo: <input type=\"text\" name=\"username\"/> <br/>"+
                "Mensaje: <input type=\"text\" name=\"password\"/> <br/>"+
                "<input type=\"submit\" value=\"Enviar\" />"+
                "</form>"+
                "</body></html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        // read form fields
        String username = request.getParameter("username");
        String password = request.getParameter("password");
         
        //System.out.println("username: " + username);
        //System.out.println("password: " + password);
 
        // do some processing here...
         
        
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Su mensaje ha sido enviado, " + username + "<br/>";      
        //htmlRespone += "Your password is: " + password  + "<br/>";    
        //htmlRespone += "Your mail: " + con.enviarCorreo() + "</h2>";    
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);
        
        Contacto con = new Contacto();
        con.enviarCorreo(password, username, "[AYD2]");
    }

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
