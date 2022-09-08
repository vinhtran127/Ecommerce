/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.product;
import Entity.productDetail;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
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
@MultipartConfig
@WebServlet(name = "saveEditProduct", urlPatterns = {"/saveEditProduct"})
public class saveEditProduct extends HttpServlet {

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
//    saveEditProduct?pid=${o.productID}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        String productID = request.getParameter("pid");
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
            productDetail pd = new DAO.productDetailDAO().getAnProductDetail(productID+"", size);
            int howManyAdd = 0;
            if(pd==null){
                new DAO.productDetailDAO().addProductDetail(productID+ "", size, quantity);
            }else{
                howManyAdd = Integer.parseInt(quantity)-Integer.parseInt(pd.getQuantity());
                new DAO.productDetailDAO().updateQuantity(productID+"", size, quantity);
            }
            product p = new DAO.productDAO().getProductByID(productID);
            int newQuan = p.getQuantity()+howManyAdd;
            new DAO.productDAO().updateProduct(productID, name, available, description, imgToDB, categoryID, quantity, price, sale);
            request.setAttribute("messSuccess", "Insert succesfully");
        request.getRequestDispatcher("productManager").forward(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addProduct.class.getName()).log(Level.SEVERE, null, ex);
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
