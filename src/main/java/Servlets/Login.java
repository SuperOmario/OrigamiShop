/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Manager.UserManager;
import Shop.RegisteredUser;
import Utils.IConstants;
import Utils.Message;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Omar
 */
public class Login extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            boolean remember = "true".equals(request.getParameter("remember"));
            
            //Adapted from https://howtodoinjava.com/java/regex/java-regex-validate-email-address/ 
            String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
            Pattern mailFormat = Pattern.compile(regex);
            Matcher matcher = mailFormat.matcher(email);
            if (matcher.matches()){
                UserManager uMgr = new UserManager();
                RegisteredUser user = uMgr.loginUser(email, password);
            
                if (user == null) {
                    Message message = new Message("Incorrect email or password", IConstants.MESSAGE_TYPE_ERROR);
                    request.getSession(true).setAttribute("message", message);
                    request.getRequestDispatcher("/login.jsp").forward(request, response);
                } 
                else {
                    if (remember) {
                        Cookie ck = new Cookie((IConstants.SESSION_KEY_USER + "cookie"), user.getEmail());
                        response.addCookie(ck);
                    }
                    request.getSession(true).setAttribute(IConstants.SESSION_KEY_USER, user);
                    request.getRequestDispatcher("/Home").forward(request, response);
                }
            } 
            else {
                Message message = new Message("Invalid email format", IConstants.MESSAGE_TYPE_ERROR);
                request.getSession(true).setAttribute("message", message);
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }    
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
