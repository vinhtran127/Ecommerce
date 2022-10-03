/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.cart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinh2
 */
public class cartDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public cart getCart(String accID, String productID, String size) {
        String query = "select c.cartID, c.accID,c.productID,p.name,c.quantity,p.price-p.price*p.sale/100 as price,c.size,p.img from Cart_HE153663_SE1606 c\n"
                + "inner join Product_HE153663_SE1606 p \n"
                + "ON c.productID = p.productID\n"
                + "where c.accID = ? and c.productID =? and c.size = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, accID);
            ps.setString(2, productID);
            ps.setString(3, size);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new cart(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void addCart(String accID, String productID, int quantity, String size) {
        String query = "insert into Cart_HE153663_SE1606 values(?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, accID);
            ps.setString(2, productID);
            ps.setInt(3, quantity);
            ps.setString(4, size);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateQuantity(String accID, String productID, String quantity, String size) {
        String query = "update Cart_HE153663_SE1606 set quantity = ? where size =? and accID =? and productID=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, quantity);
            ps.setString(2, size);
            ps.setString(3, accID);
            ps.setString(4, productID);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    public void removeFromCart(String accID, String productID, String size) {
        String query = "delete from Cart_HE153663_SE1606 where size =? and accID =? and productID=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, size);
            ps.setString(2, accID);
            ps.setString(3, productID);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    public void removeFromCartByAccID(String accID) {
        String query = "delete from Cart_HE153663_SE1606 where accID =? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, accID);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    public void removeFromCartByProductID(String productID) {
        String query = "delete from Cart_HE153663_SE1606 where productID =? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, productID);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    public List<cart> getCartByAccID(String accID) {
        List<cart> listCart = new ArrayList<>();
        String query = "select c.cartID, c.accID,c.productID,p.name,c.quantity,p.price,c.size,p.img from Cart_HE153663_SE1606 c\n"
                + "inner join Product_HE153663_SE1606 p \n"
                + "ON c.productID = p.productID\n"
                + "where c.accID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, accID);
            rs = ps.executeQuery();
            while (rs.next()) {
                listCart.add(new cart(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8)));
            }
        } catch (Exception e) {
        }
        return listCart;
    }

    public List<String> getProductByAccID(String accID) {
        List<String> listP = new ArrayList<>();
        String query = "SELECT DISTINCT productID FROM Cart_HE153663_SE1606 where accID =?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, accID);
            rs = ps.executeQuery();
            while (rs.next()) {
                listP.add(rs.getString(1));
            }
        } catch (Exception e) {
        }
        return listP;
    }

    public int countProductInCart(String accID) {
        List<cart> listCart = new ArrayList<>();
        String query = "select COUNT(*) from Cart_HE153663_SE1606 where accID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, accID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
}
