/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author vinh2
 */
@WebServlet(name = "addProduct", urlPatterns = {"/addProduct"})
@MultipartConfig
public class addProduct extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
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
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        String quantity = request.getParameter("quantity");
        String size = request.getParameter("size");
        String categoryID = request.getParameter("category");
        String available = request.getParameter("available");
        String sale = request.getParameter("sale");
        String path = "D:\\javaweb\\ECommerce\\web\\img";
        Part imgPart = request.getPart("imgFile");
        String imgFileName = imgPart.getSubmittedFileName();
        OutputStream os = null;
        InputStream is = null;
        try {
            os = new FileOutputStream(new File(path + File.separator + imgFileName));
            is = imgPart.getInputStream();
            int read = 0;
            while ((read = is.read()) != -1) {
                os.write(read);
            }
        } catch (Exception e) {
        }
        String imgToDB = "img/" + imgFileName;
        try {
            new DAO.productDAO().addProduct(name, available, description, imgToDB, categoryID, quantity, price, sale);
            int newID = new DAO.productDAO().getTop1ID();
            new DAO.productDetailDAO().addProductDetail(newID+"", size, quantity);
            request.setAttribute("messSuccess", "Insert succesfully");
            request.getRequestDispatcher("productManager").forward(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    public boolean uploadFile(InputStream is, String path) {
//        boolean test = false;
//        try {
//            byte[] b = new byte[is.available()];
//            is.read();
//            FileOutputStream fops = new FileOutputStream(path);
//            fops.write(b);
//            fops.flush();
//            fops.close();
//            test = true;
//        } catch (Exception e) {
//        }
//        return test;
//    }
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
