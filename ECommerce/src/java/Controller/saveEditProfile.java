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
@WebServlet(name = "saveEditProfile", urlPatterns = {"/saveEditProfile"})
public class saveEditProfile extends HttpServlet {

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
        HttpSession session = request.getSession();
        account acc = (account) session.getAttribute("acc");
        int accID = acc.getAccID();
        String email = request.getParameter("email").trim();
        String phone = request.getParameter("phone").trim();
        String fullname = request.getParameter("fullname").trim();
        String username = request.getParameter("username").trim();
        String address = request.getParameter("address").trim();
        String securityQ = request.getParameter("securityQues").trim();
        String answer = request.getParameter("answer").trim();
        new DAO.accountDAO().updateAccount(email, phone, fullname, securityQ, answer, username);
        List<address> listAdd = new DAO.addressDAO().getAddressByAccid(accID + "");
        if (listAdd.isEmpty()) {
            new DAO.addressDAO().addAddress(acc.getAccID() + "", address,true );
        }
        else{
            boolean isExist = false;
            for(address a : listAdd){
                if(a.getAddress().equals(address)){
                    isExist = true;
                }
            }
            if(!isExist){
                new DAO.addressDAO().updateDefault(accID+"", false);
                new DAO.addressDAO().addAddress(accID+"", address, true);
            }
        }
        request.getRequestDispatcher("editProfile").forward(request, response);
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
