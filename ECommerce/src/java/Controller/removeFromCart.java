/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.account;
import Entity.cart;
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
@WebServlet(name = "removeFromCart", urlPatterns = {"/removeFromCart"})
public class removeFromCart extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        account acc = (account) session.getAttribute("acc");
        String accID = acc.getAccID() + "";
        String productID = request.getParameter("productID");
        String size = request.getParameter("size");
        new DAO.cartDAO().removeFromCart(accID, productID, size);
        int numnerP = (int) session.getAttribute("numberP");
        session.setAttribute("numberP",numnerP-1);
        List<cart> listCart = new DAO.cartDAO().getCartByAccID(accID);
        int productPayment = 0;
        for (cart c : listCart) {
            productPayment += c.getPrice() * c.getQuantity();
        }
        session.setAttribute("productPayment", productPayment);
        PrintWriter out = response.getWriter();
        String s = "";
        for (cart c : listCart) {
            s += "                                <tr>\n"
                    + "                                    <td class=\"cart_product\">\n"
                    + "                                        <a href=\"\">" + c.getProductName() + "</a>\n"
                    + "\n"
                    + "                                    </td>\n"
                    + "                                    <td class=\"cart_img\">\n"
                    + "                                        <a href=\"\"><img src=\"" + "" + "\" alt=\"\"></a>\n"
                    + "                                    </td>\n"
                    + "                                    <td class =\"cart_size\">\n"
                    + "                                        <p id=\"needToGet\">" + c.getSize() + "</p>\n"
                    + "                                    </td>\n"
                    + "                                    <td class=\"cart_price\">\n"
                    + "                                        <p>" + c.getPrice() + "₫</p>\n"
                    + "                                    </td>\n"
                    + "                                    <td class=\"cart_quantity\">\n"
                    + "                                        <div class=\"cart_quantity_button\">\n"
                    + "                                            <a onclick=\"setNewQuan(" + c.getProductID() + "," + (c.getQuantity() - 1) + ",)\" class=\"btn cart_quantity_up\" >-</a>\n"
                    + "\n"
                    + "                                            <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"" + c.getQuantity() + "\" readonly=\"\" size=\"2\">\n"
                    + "                                            <a onclick=\"setNewQuan(" + c.getProductID() + "," + (c.getQuantity() + 1) + ",)\" class=\"btn cart_quantity_down\" >+</a>\n"
                    + "\n"
                    + "                                        </div>\n"
                    + "                                    </td>\n"
                    + "                                    <td class=\"cart_total\">\n"
                    + "                                        <p class=\"cart_total_price\">" + (c.getQuantity() * c.getPrice()) + "₫</p>\n"
                    + "                                    </td>\n"
                    + "                                    <td class=\"cart_delete\">\n"
                    + "                                        <a onclick=\"remove(" + c.getProductID() + ")\" class=\"btn cart_quantity_delete\"><i class=\"fa fa-times\"></i></a>\n"
                    + "                                    </td>\n"
                    + "                                </tr>";
        }
        s += "                                ^<li>Products payment      <span>" + productPayment + "₫</span></li>\n"
                + "                                <li>Transport fee     <span>Free</span></li>\n"
                + "                                <li>Total payment     <span>" + productPayment + "₫</span></li>";
        out.print(s);
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
