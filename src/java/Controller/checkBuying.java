/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.accountDAO;
import Entity.account;
import Entity.cart;
import Entity.order;
import Entity.product;
import Entity.productDetail;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "checkBuying", urlPatterns = {"/checkBuying"})
public class checkBuying extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String verifyCode = request.getParameter("code");
        String paymentMethod = (String) session.getAttribute("paymentMethod");
        String address = (String) session.getAttribute("address");

        String sentCode = (String) session.getAttribute("buyingCode");
        account acc = (account) session.getAttribute("acc");
        int accID = acc.getAccID();
        if (verifyCode.equals(sentCode)) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            List<cart> listCart = new DAO.cartDAO().getCartByAccID(accID + "");
            for (cart c : listCart) {
                new DAO.orderDAO().insertOrder(accID + "", c.getProductID() + "", c.getSize(), c.getQuantity(),
                        (c.getPrice() * c.getQuantity()), paymentMethod, formatter.format(date));

                productDetail pd = new DAO.productDetailDAO().getAnProductDetail(c.getProductID() + "", c.getSize());
                int newQuanPD = Integer.parseInt(pd.getQuantity()) - c.getQuantity();
                new DAO.productDetailDAO().updateQuantity(c.getProductID() + "", c.getSize(), newQuanPD + "");

                product p = new DAO.productDAO().getProductByID(c.getProductID() + "");
                int newQuanP = p.getQuantity() - c.getQuantity();
                new DAO.productDAO().updateQuantity(c.getProductID() + "", newQuanP);
                new DAO.cartDAO().removeFromCartByAccID(accID + "");
                session.setAttribute("numberP", 0);
                request.setAttribute("messSuccess", "Purchase succesfully");
            }

        } else {
            int timeTrying = (int) session.getAttribute("timeTrying");
            timeTrying++;
            session.setAttribute("timeTrying", timeTrying);
            if (timeTrying < 3) {
                request.setAttribute("messAlert", "Your code is wrong, re-enter:");
            } else {
                request.setAttribute("messAlert", "You tried a lot of time pls go to cart and check");
                request.getRequestDispatcher("buying.jsp").forward(request, response);
            }
            request.setAttribute("messAlert", "Sign up fail, your code is wrong, re-enter");
        }
        request.getRequestDispatcher("buying.jsp").forward(request, response);
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
