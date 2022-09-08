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
@WebServlet(name = "shopByCate", urlPatterns = {"/shopByCate"})
public class shopByCate extends HttpServlet {

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
        String cateID = request.getParameter("cateID");
        int countP = new productDAO().countProduct("", cateID);
        String sIndex = request.getParameter("index");
        if (sIndex == null) {
            sIndex = "1";
        }
        int index = Integer.parseInt(sIndex);
        List<product> listP = new DAO.productDAO().getProductByCate(index, cateID);
        List<category> listC = new categoryDAO().getAllCategory();
//        request.setAttribute("listP", listP);
//        request.setAttribute("listC", listC);
        session.setAttribute("listP", listP);
        session.setAttribute("listC", listC);
        session.setAttribute("serv", "shopByCate");
        session.setAttribute("cateID", cateID);
        int pageSize = 9;
        int endPage = countP % pageSize == 0 ? (countP / pageSize) : (countP / 9 + 1);
        request.setAttribute("endPage", endPage);
        request.setAttribute("page", index);
        request.getRequestDispatcher("shop.jsp").forward(request, response);

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
