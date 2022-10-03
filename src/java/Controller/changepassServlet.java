/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "changepassServlet", urlPatterns = {"/changepass"})
public class changepassServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        String email = "";
        String originPass = "";
        Cookie arr[] = request.getCookies(); // trả về dãy các cookies
        if (arr != null) { // !(nếu cookie bị xoá hết khi đóng trình duyệt)
            for (Cookie o : arr) {
                if (o.getName().equals("emailC")) {
                    email = o.getValue();
                }
                if (o.getName().equals("passC")) {
                    originPass = o.getValue();
                }
            }
        }
        String oldPass = request.getParameter("oldpass");
        String newPass = request.getParameter("newpass");
        String reNewpass = request.getParameter("reNewpass");
        if (!oldPass.equals(originPass)) {
            request.setAttribute("messAlert", "Old pass is incorrect");
        } else {
            if (!newPass.equals(reNewpass)) {
                request.setAttribute("messAlert", "Pass and repass don't match");
            } else {
                request.setAttribute("messSuccess", "Change pass succesfully");
                try {
                    new DAO.accountDAO().setNewPass(email, newPass);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(changepassServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        request.getRequestDispatcher("changePass.jsp").forward(request, response);
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
