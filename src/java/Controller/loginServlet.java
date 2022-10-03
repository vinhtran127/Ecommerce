/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.account;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "loginServlet", urlPatterns = {"/login"})
public class loginServlet extends HttpServlet {

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
        Cookie arr[] = request.getCookies(); // trả về dãy các cookies
        if (arr != null) { // !(nếu cookie bị xoá hết khi đóng trình duyệt)
            for (Cookie o : arr) {
                if (o.getName().equals("emailC")) {
                    request.setAttribute("emailC", o.getValue());
                }
                if (o.getName().equals("passC")) {
                    request.setAttribute("passC", o.getValue());
                }
            }
        }

        request.getRequestDispatcher("login.jsp").forward(request, response);
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
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String remember = request.getParameter("remember");
//        account acc = new DAO.accountDAO().getAnAccount(email, pass);
        account acc= null;
        if (acc == null) {
            request.setAttribute("messAlert", "Wrong username or pass");
            request.setAttribute("emailC", email);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            if (!acc.isIsAdmin() && !acc.isIsCustomer()) {
                request.setAttribute("messAlert", "Account is being banned");
                request.setAttribute("emailC", email);
                request.getRequestDispatcher("login.jsp").forward(request, response);

            } else {
                HttpSession session = request.getSession();
                String accID = acc.getAccID()+"";
                int numberProductInCart = new DAO.cartDAO().countProductInCart(accID);
                session.setAttribute("acc", acc);
                session.setAttribute("numberP", numberProductInCart);
                Cookie userC = new Cookie("emailC", email);
                Cookie passC = new Cookie("passC", pass);

                if (remember != null) {
                    userC.setMaxAge(3600);
                    passC.setMaxAge(3600);
                } else {
                    userC.setMaxAge(0);
                    passC.setMaxAge(0);
                }

                response.addCookie(userC);
                response.addCookie(passC);
                request.getRequestDispatcher("home").forward(request, response);
            }
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
