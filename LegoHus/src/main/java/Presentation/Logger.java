/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Mapper.DataMapper;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shpattt
 */
@WebServlet(name = "Logger", urlPatterns = {"/Logger"})
public class Logger extends HttpServlet {

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
            out.println("<title>Servlet Logger</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Logger at " + request.getContextPath() + "</h1>");
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataMapper data = new DataMapper();
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        
        String from = request.getParameter("from");
       
        
        if (from != null && from.equals("login") && email != null && pass != null && email.equals(data.getInfo(email).getEmail()) && pass.equals(data.getInfo(email).getPassword()))
        {
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            System.out.println("testerbro");
            request.getRequestDispatcher("/legohouse.jsp").forward(request, response);
        }
        else 
        {
             request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataMapper data = new DataMapper(); 
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String pass1 = request.getParameter("pass1");
        String from1 = request.getParameter("from1");
        
        if(from1 != null && from1.equals("reger") && email != null && pass != null && pass1.equals(pass))
        {
            data.insertUser(email, pass);
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }
       
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
