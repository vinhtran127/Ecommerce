/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.productDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinh2
 */
public class productDetailDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<String> getAllProductSize(String productID) {
        List<String> listSize = new ArrayList<>();
        String query = "select DISTINCT size from productDetail_HE153663_SE1606 where productID = ? and quantity>0";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, productID);
            rs = ps.executeQuery();
            while (rs.next()) {
                listSize.add(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listSize;
    }

    public productDetail getAnProductDetail(String productID, String size) {
        String query = "select * from productDetail_HE153663_SE1606 where productID = ? and size=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, productID);
            ps.setString(2, size);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new productDetail(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void updateQuantity(String productID, String size, String quantity) {
        String query = "update productDetail_HE153663_SE1606 set quantity =? where productID = ? and size=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, quantity);
            ps.setString(2, productID);
            ps.setString(3, size);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addProductDetail(String productID, String size, String quantity) {
        String query = "insert into productDetail_HE153663_SE1606 values(?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, productID);
            ps.setString(2, size);
            ps.setString(3, quantity);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteProductDetail(String productID) {
        String query = "delete from productDetail_HE153663_SE1606 where productID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, productID);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
