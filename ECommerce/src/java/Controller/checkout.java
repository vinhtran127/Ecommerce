/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.categoryDAO;
import Entity.account;
import Entity.address;
import Entity.cart;
import Entity.category;
import Entity.productDetail;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinh2
 */
@WebServlet(name = "checkout", urlPatterns = {"/checkout"})
public class checkout extends HttpServlet {

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
        int accID = acc.getAccID();
        List<cart> listCart = new DAO.cartDAO().getCartByAccID(accID + "");
        boolean isEnough = true;
        for (cart c : listCart) {
            productDetail pd = new DAO.productDetailDAO().getAnProductDetail(c.getProductID() + "", c.getSize());
            if (pd == null || c.getQuantity() > Integer.parseInt(pd.getQuantity())) {
                isEnough = false;
            }
        }
        if (isEnough) {
            List<address> listAddress = new DAO.addressDAO().getAddressByAccid(accID + "");
            List<category> listC = new categoryDAO().getAllCategory();
            request.setAttribute("listC", listC);
            session.setAttribute("listCart", listCart);
            session.setAttribute("listAddress", listAddress);
            request.getRequestDispatcher("checkout.jsp").forward(request, response);
        } else {
            String alert = "<p>We only have:</p>";
            for (cart c : listCart) {
                productDetail pd = new DAO.productDetailDAO().getAnProductDetail(c.getProductID() + "", c.getSize());
                if (pd == null) {
                    alert += "<p>" + 0 + " product(s) have name: " + "<b>" + c.getProductName() + "</b>" + " having size " + c.getSize() + " in out shop and you buy "+c.getQuantity()+"</p>";
                } else {
                    if (c.getQuantity() > Integer.parseInt(pd.getQuantity())) {
                        alert += "<p>" + pd.getQuantity() + " product(s) have name: " + "<b>" + c.getProductName() + "</b>" + " having size " + c.getSize() + " in out shop and you buy "+c.getQuantity()+"</p>";
                    }
                }
            }
            alert += "<p> Pls re-check your cart <3 </p> ";
            request.setAttribute("messAlert", alert);
            request.getRequestDispatcher("alert.jsp").forward(request, response);
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
