/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.comment;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vinh2
 */
public class commentDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<comment> getComment(String productID) {
        List<comment> listCmt = new ArrayList<>();
        String query = "select c.commentID,c.productID,c.accID,a.username,c.rating, c.content,c.[date]  from Comment_HE153663_SE1606 c\n"
                + "inner join Account_HE153663_SE1606 a\n"
                + "on c.accID = a.accID \n"
                + "where c.productID = ?\n"
                + "order by c.[date] desc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, productID);
            rs = ps.executeQuery();
            while (rs.next()) {
                listCmt.add(new comment(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getDate(7)));
            }
        } catch (Exception e) {
        }
        return listCmt;
    }

    public void addComment(int productID, int accID, int rating, String content, String date) {
        String query = "insert into Comment_HE153663_SE1606 values(?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, productID);
            ps.setInt(2, accID);
            ps.setInt(3, rating);
            ps.setString(4, content);
            ps.setString(5, date);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void removeFromComment(String productID) {
        String query = "delete from Comment_HE153663_SE1606 where productID = ?";
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
