/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.account;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "addComment", urlPatterns = {"/addComment"})
public class addComment extends HttpServlet {

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
//        processRequest(request, response);
        HttpSession session = request.getSession();
        account acc = (account) session.getAttribute("acc");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        String comment = request.getParameter("comment");
        int rating = (int) session.getAttribute("starPoint");
        int productID = Integer.parseInt(request.getParameter("productID"));
        int accID = acc.getAccID();
        Date date = new Date();
        new DAO.commentDAO().addComment(productID, accID, rating, comment, formatter.format(date));
        int numberOfReview = new DAO.commentDAO().getComment(productID + "").size();
        PrintWriter out = response.getWriter();
        String s = " <div class=\"media mb-4\">\n"
                + "                                            <img src=\"img/user.jpg\" alt=\"Image\" class=\"img-fluid mr-3 mt-1\" style=\"width: 45px;\">\n"
                + "                                            <div class=\"media-body\">\n"
                + "                                                <h6>" + acc.getUsername() + "<small> - <i>" + formatter.format(date) + "</i></small></h6>\n"
                + "                                                <div class=\"text-primary mb-2\">";
        for (int i = 1; i < 6; i++) {
            if (i <= rating) {
                s += " <i class=\"fa-solid fa-star\"></i>";
            } else {
                s += "<i class=\"far fa-star\"></i>";
            }
        }
        s += "<p>" + comment + "</p>,";
        for (int i = 0; i < 5; i++) {
            s += "<a onclick=\"ratingStar(" + i + ")\" class=\"btn btn-sm p-0\" >\n"
                    + "                                                    <i class=\"far fa-star\"></i>\n"
                    + "                                                </a>";
        }
        s += "                        ,<a id =\"numberOfReview\" class=\"nav-item nav-link\" data-toggle=\"tab\" href=\"#tab-pane-2\">Reviews (" + numberOfReview + ")</a>\n";
        out.print(s);
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
