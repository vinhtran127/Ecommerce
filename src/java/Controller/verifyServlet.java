/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.accountDAO;
import Entity.account;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "verifyServlet", urlPatterns = {"/verify"})
public class verifyServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        String verifyCode = request.getParameter("code");
        String sentCode = (String)session.getAttribute("capchar");
        if (verifyCode.equals(sentCode)) {
            String email = (String)session.getAttribute("email");
            String phone = (String)session.getAttribute("phone");
            String username = (String)session.getAttribute("username");
            String fullname = (String)session.getAttribute("fullname");
            String pass = (String)session.getAttribute("pass");
            
            try {
                new DAO.accountDAO().addAccount(email, fullname, username, pass);
                account acc = new accountDAO().searchAccountByEmail(email);
//                new DAO.addressDAO().addAddress(acc.getAccID()+"", address,defaultAdd);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(verifyServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

            request.setAttribute("messSuccess", "Register finish, you can go to login");
        } else {
            int timeTrying = (int)session.getAttribute("timeTrying");
            timeTrying++;
            session.setAttribute("timeTrying", timeTrying);
            if(timeTrying<3){
                request.setAttribute("messAlert", "Sign up fail, your code is wrong, re-enter:");
            }else{
                request.setAttribute("messAlert", "You tried a lot of time pls re-signup");
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            }
            request.setAttribute("messAlert", "Sign up fail, your code is wrong, re-enter");
        }
        request.getRequestDispatcher("verify.jsp").forward(request, response);
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
