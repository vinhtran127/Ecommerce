/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.orderDAO;
import DAO.productDAO;
import Entity.account;
import Entity.cart;
import Entity.order;
import Entity.product;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinh2
 */
@WebServlet(name = "addToCart", urlPatterns = {"/addToCart"})
public class addToCart extends HttpServlet {

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
        HttpSession session = request.getSession();
        account acc = (account) session.getAttribute("acc");
        String accID = acc.getAccID() + "";
        String productID = request.getParameter("productID");
        String size = request.getParameter("size");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        if (size == null) {
            size = "S";
        }
        cart c = new DAO.cartDAO().getCart(accID, productID, size);
        if (c == null) {
            int numberProductInCart = (int) session.getAttribute("numberP");
            session.setAttribute("numberP", numberProductInCart + 1);
            new DAO.cartDAO().addCart(accID, productID, quantity, size);
        } else {
            int updateQuantity = c.getQuantity() + quantity;
            new DAO.cartDAO().updateQuantity(accID, productID, updateQuantity + "", size);
        }
        PrintWriter out = response.getWriter();
        out.print("                            <i class=\"fas fa-shopping-cart text-primary\"></i>\n"
                + "                            <span id =\"numP\" class=\"badge\">"+session.getAttribute("numberP")+"</span>");
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
