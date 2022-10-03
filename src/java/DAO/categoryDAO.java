/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author vinh2
 */
public class categoryDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<category> getAllCategory(){
        List<category> listC = new ArrayList();
        String query= "select * from category_HE153663_SE1606";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                listC.add(new category(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5)));
                        
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listC;
    }
}
