/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Manager.ProductManager;
import Manager.UserManager;
import Shop.InventoryEntry;
import Shop.Cart;
import Shop.RegisteredUser;
import Utils.IConstants;
import Utils.Message;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Omar
 */
public class AddToCartFromHome extends HttpServlet {

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
            if (request.getSession(true).getAttribute(IConstants.SESSION_KEY_USER) == null){
                Message message = new Message("Please log in before adding to the cart", IConstants.MESSAGE_TYPE_ERROR);
                request.getSession(true).setAttribute("message", message);
                request.getRequestDispatcher("/Home").forward(request,response);
                return;
            }
            
            String productID = request.getParameter("product");
            ProductManager PM = new ProductManager();
            
            if (request.getSession(true).getAttribute("cart") == null) {
                Cart cart = new Cart(1, new ArrayList<InventoryEntry>(), 0, 0);
                request.getSession(true).setAttribute("cart", cart);
            }
            
            Cart cart = (Cart)request.getSession(true).getAttribute("cart");
            
            cart = PM.addToCartFromHome(cart, productID);
            request.getSession(true).setAttribute("cart", cart);
            request.getRequestDispatcher("/Home").forward(request,response);
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
