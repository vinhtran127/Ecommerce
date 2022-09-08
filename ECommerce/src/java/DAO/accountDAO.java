/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.account;
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
public class accountDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<account> getAllAccount() {
        List<account> listA = new ArrayList();
        String query = "select * from account_HE153663_SE1606";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listA.add(new account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getBoolean(9),
                        rs.getBoolean(10)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listA;
    }

    public void updateAccountRole(String accID, boolean isAmdin, boolean isCustomer) {
        String query = "update account_HE153663_SE1606 set isAdmin = ?, isCustomer = ? "
                + "where accID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setBoolean(1, isAmdin);
            ps.setBoolean(2, isCustomer);
            ps.setString(3, accID);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void updateAccount(String email, String phone, String fullname, String sercurityQ, String answer,String username) {
        String query = "update account_HE153663_SE1606 set  phone = ?,"
                + "fullname = ?, securityQ =?,  answer=?, username=?"
                + "where email = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, phone);
            ps.setString(2, fullname);
            ps.setString(3, sercurityQ);
            ps.setString(4, answer);
            ps.setString(5, username);
            ps.setString(6, email);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public account getAnAccount(String email, String pass) {
        String query = "select * from account_HE153663_SE1606 where [email] = ? and password = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getBoolean(9),
                        rs.getBoolean(10));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public account searchAccountByEmail(String email) throws ClassNotFoundException {
        String query = "select * from Account_HE153663_SE1606 where [email] = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getBoolean(9),
                        rs.getBoolean(10));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public void addAccount(String email, String fullname, String username, String pass) throws ClassNotFoundException {
        String query = "insert into Account_HE153663_SE1606(email,fullname,username,password,isAdmin,isCustomer) values(?,?,?,?,0,1)";

        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, email);
//            ps.setString(2, phone);
            ps.setString(2, fullname);
//            ps.setString(4, ques);
//            ps.setString(5, answer);
            ps.setString(3, username);
            ps.setString(4, pass);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void setNewPass(String email, String pass) throws ClassNotFoundException {
        String query = "UPDATE Account_HE153663_SE1606 set [password] = ? where [email] = ?";

        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, pass);
            ps.setString(2, email);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
