/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.address;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinh2
 */
public class addressDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<address> getAddressByAccid(String accID) {
        List<address> listAdd = new ArrayList();
        String query = "select * from Address_HE153663_SE1606 where accID= ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, accID);
            rs = ps.executeQuery();
            while (rs.next()) {
                listAdd.add(new address(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getBoolean(4)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listAdd;
    }

    public void addAddress(String accID, String address, boolean defaultAdd) {
        String query = "insert into Address_HE153663_SE1606 values(?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, accID);
            ps.setString(2, address);
            ps.setBoolean(3, defaultAdd);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateDefault(String accID, boolean defaultAdd) {
        String query = "UPDATE Address_HE153663_SE1606\n"
                + "SET defaultAdd = ?\n"
                + "WHERE accID = ?;";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setBoolean(1, defaultAdd);
            ps.setString(2, accID);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
