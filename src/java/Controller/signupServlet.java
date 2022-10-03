/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Authentication.authenCapchar;
import DAO.accountDAO;
import Entity.account;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.MessagingException;
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
@WebServlet(name = "signupServlet", urlPatterns = {"/signup"})
public class signupServlet extends HttpServlet {

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
        request.getRequestDispatcher("/Views/Signup.jsp").forward(request, response);
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
        String passPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$";
        Pattern pat = Pattern.compile(passPattern);
        String email = request.getParameter("email").trim();
//        String phone = request.getParameter("phone").trim();
        String fullname = request.getParameter("fullname").trim();
        String username = request.getParameter("username").trim();
//        String address = request.getParameter("address").trim();
//        String securityQ = request.getParameter("securityQues").trim();
//        String answer = request.getParameter("answer").trim();
        String pass = request.getParameter("pass");
        String repass = request.getParameter("repass");

        session.setAttribute("email", email);
        session.setAttribute("username", username);
        session.setAttribute("fullname", username);
//        session.setAttribute("phone", username);
//        session.setAttribute("address", address);

        accountDAO accDAO = new accountDAO();

        Matcher mat = pat.matcher(pass);
        if (!mat.matches()) {
            request.setAttribute("mess1", "Password have at least 8 character contain at least one number, one lowercase, one uppercase");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        }
        if (!(pass.equals(repass))) {
            request.setAttribute("mess1", "Repass doesn't match");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        }
        try {
            account acc = accDAO.searchAccountByEmail(email);
            if (acc == null) {
                session.setAttribute("pass", pass);
//                session.setAttribute("ques", securityQ);
//                session.setAttribute("answer", answer);
                session.setAttribute("timeTrying", 0);
                authenCapchar authen = new authenCapchar();
                String capchar = authen.createAnCapchar();
                authen.sendMail(email, capchar,"generateCapchar");
                session.setAttribute("capchar", capchar);
                request.getRequestDispatcher("verify.jsp").forward(request, response);
            } else {
                request.setAttribute("mess1", "Email is already exist");
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(signupServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(signupServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
