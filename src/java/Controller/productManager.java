/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.categoryDAO;
import DAO.productDAO;
import Entity.category;
import Entity.product;
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
@WebServlet(name = "productManager", urlPatterns = {"/productManager"})
public class productManager extends HttpServlet {

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
        HttpSession session = request.getSession();
        String sIndex = request.getParameter("index");
        if (sIndex == null) {
            sIndex = "1";
        }
        int index = Integer.parseInt(sIndex);
        List< product> listP = new productDAO().getProductToPage(index, "", "");
        List<category> listC = new categoryDAO().getAllCategory();
        int countP = new productDAO().countProduct("", "");
        request.setAttribute("allProduct", countP);
        request.setAttribute("listP", listP);
        session.setAttribute("listC", listC);
        session.setAttribute("servs", "productManager");

        int pageSize = 6;
        int endPage = countP % pageSize == 0 ? (countP / pageSize) : (countP / 6 + 1);
        if (countP == 0) {
            request.setAttribute("numInEnd", 0);
        } else {
            if (countP % 6 == 0) {
                request.setAttribute("numInEnd", 6);
            } else {
                request.setAttribute("numInEnd", countP % 6);

            }
        }

        request.setAttribute("endPage", endPage);
        request.setAttribute("page", index);
        request.getRequestDispatcher("productManager.jsp").forward(request, response);

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
        String sIndex = request.getParameter("index");
        if (sIndex == null) {
            sIndex = "1";
        }
        int index = Integer.parseInt(sIndex);
        List< product> listP = new productDAO().getProductToPage(index, "", "");
        List<category> listC = new categoryDAO().getAllCategory();
        int countP = new productDAO().countProduct("", "");
        session.setAttribute("allProduct", countP);
        session.setAttribute("listP", listP);
        session.setAttribute("listC", listC);
        int pageSize = 6;
        int endPage = countP % pageSize == 0 ? (countP / pageSize) : (countP / 6 + 1);
        if (countP % 6 != 0) {
            request.setAttribute("numInEnd", 6);
        } else {
            request.setAttribute("numInEnd", countP % 6);

        }
        request.setAttribute("endPage", endPage);
        request.setAttribute("page", index);
        request.getRequestDispatcher("productManager.jsp").forward(request, response);
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
        String sIndex = request.getParameter("index");
        if (sIndex == null) {
            sIndex = "1";
        }
        int index = Integer.parseInt(sIndex);
        List< product> listP = new productDAO().getProductToPage(index, "", "");
        List<category> listC = new categoryDAO().getAllCategory();
        int countP = new productDAO().countProduct("", "");
        session.setAttribute("allProduct", countP);
        session.setAttribute("listP", listP);
        session.setAttribute("listC", listC);
        int pageSize = 6;
        int endPage = countP % pageSize == 0 ? (countP / pageSize) : (countP / 6 + 1);
        if (countP % 6 != 0) {
            request.setAttribute("numInEnd", 6);
        } else {
            request.setAttribute("numInEnd", countP % 6);

        }
        request.setAttribute("endPage", endPage);
        request.setAttribute("page", index);
        request.getRequestDispatcher("productManager.jsp").forward(request, response);

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
