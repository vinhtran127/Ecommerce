/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.order;
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
public class orderDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<order> getOrderByUserID(String userID) {
        List<order> listO = new ArrayList<>();
        String query = "select * from  Order_HE153663_SE1606 where userID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userID);
            rs = ps.executeQuery();
            while (rs.next()) {
                listO.add(new order(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getDate(7)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listO;
    }

     public void insertOrder(String accID, String productID,String size,int quantity,int totalMoney,String paymentMethod,String date) {
        String query = "insert into Order_HE153663_SE1606 values(?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,accID);
            ps.setString(2, productID);
            ps.setString(3, size);
            ps.setInt(4, quantity);
            ps.setInt(5, totalMoney);
            ps.setString(6, paymentMethod);
            ps.setString(7, date);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

}
