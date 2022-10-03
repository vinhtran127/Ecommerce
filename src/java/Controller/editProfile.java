/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.account;
import Entity.address;
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
@WebServlet(name = "editProfile", urlPatterns = {"/editProfile"})
public class editProfile extends HttpServlet {

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
        account acc = (account) session.getAttribute("acc");
        List<address> listAdd = new DAO.addressDAO().getAddressByAccid(acc.getAccID() + "");
        if (!listAdd.isEmpty()) {
            for (address a : listAdd) {
                if (a.isDefaultAdd()) {
                    request.setAttribute("address", a.getAddress());
                }
            }
        } else {
            request.setAttribute("address", "");
        }
        request.setAttribute("email", acc.getEmail());
        request.setAttribute("phone", acc.getPhone());
        request.setAttribute("fullname", acc.getFullname());
        request.setAttribute("username", acc.getUsername());
        request.setAttribute("sQues", acc.getSecurityQ());
        request.setAttribute("sAnswer", acc.getAnswer());
        request.getRequestDispatcher("editProfile.jsp").forward(request, response);

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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        account acc = (account) session.getAttribute("acc");
        List<address> listAdd = new DAO.addressDAO().getAddressByAccid(acc.getAccID() + "");
        if (!listAdd.isEmpty()) {
            for (address a : listAdd) {
                if (a.isDefaultAdd()) {
                    request.setAttribute("address", a.getAddress());
                }
            }
        } else {
            request.setAttribute("address", "");
        }
        request.setAttribute("email", acc.getEmail());
        request.setAttribute("phone", acc.getPhone());
        request.setAttribute("fullname", acc.getFullname());
        request.setAttribute("username", acc.getUsername());
        request.setAttribute("sQues", acc.getSecurityQ());
        request.setAttribute("sAnswer", acc.getAnswer());
        request.getRequestDispatcher("editProfile.jsp").forward(request, response);

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
