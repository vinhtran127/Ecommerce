/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.product;
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
public class productDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<product> searchProduct(int index, String txt, String categoryID) {
        List<product> listP = new ArrayList<>();
        String query = "with temp as \n"
                + "(select ROW_NUMBER() over (order by productID desc) as row,* from Product_HE153663_SE1606\n"
                + "where [name] like ? and categoryID like ? and available =1)\n"
                + "select * from temp where row between ?*9-8 and ?*9";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + categoryID + "%");
            ps.setInt(3, index);
            ps.setInt(4, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                listP.add(new product(rs.getInt(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listP;
    }

    public List<product> search6Product(int index, String txt) {
        List<product> listP = new ArrayList<>();
        String query = "with temp as \n"
                + "(select ROW_NUMBER() over (order by productID desc) as row,* from Product_HE153663_SE1606\n"
                + "where [name] like ?)\n"
                + "select * from temp where row between ?*6-5 and ?*6";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setInt(2, index);
            ps.setInt(3, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                listP.add(new product(rs.getInt(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listP;
    }

    public List<product> getProductToPage(int index, String txt, String categoryID) {
        List<product> listP = new ArrayList<>();
        String query = "with temp as \n"
                + "(select ROW_NUMBER() over (order by productID desc) as row,* from Product_HE153663_SE1606\n"
                + "where [name] like ? and categoryID like ? )\n"
                + "select * from temp where row between ?*6-5 and ?*6";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + categoryID + "%");
            ps.setInt(3, index);
            ps.setInt(4, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                listP.add(new product(rs.getInt(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listP;
    }

    public List<product> getProductByCate(int index, String cateID) {
        List<product> listP = new ArrayList<>();
        String query = "with temp as \n"
                + "(select ROW_NUMBER() over (order by productID desc) as row,* from Product_HE153663_SE1606\n"
                + "where [categoryID] = ? and available =1)\n"
                + "select * from temp where row between ?*9-8 and ?*9";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, cateID);
            ps.setInt(2, index);
            ps.setInt(3, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                listP.add(new product(rs.getInt(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listP;
    }

    public int countProduct(String txt, String categoryID) {
        List<product> listP = new ArrayList<>();
//        String query = "select * from Product_HE153663_SE1606";
        String query = "select count(*) from Product_HE153663_SE1606 where name like ? and categoryID like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + categoryID + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public int countProductSearched(String txt) {
        List<product> listP = new ArrayList<>();
//        String query = "select * from Product_HE153663_SE1606";
        String query = "select count(*) from Product_HE153663_SE1606 where name like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

//    public int countProductByCate(String cateID) {
//        List<product> listP = new ArrayList<>();
//        String query = "select count(*) from Product_HE153663_SE1606 where categoryID like ?";
//        try {
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(query);
//            ps.setString(1, "%"+cateID+"%");
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                return rs.getInt(1);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return 0;
//    }
    public List<product> getNewProduct() {
        List<product> listP = new ArrayList<>();
        String query = "select top 8 * from Product_HE153663_SE1606 where available=1\n"
                + "order by productID desc;";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listP.add(new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listP;
    }

    public product getProductByID(String productID) {
        String query = "select * from Product_HE153663_SE1606 where productID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, productID);
            rs = ps.executeQuery();
            while (rs.next()) {
                product p = new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9));
                return p;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<product> getPoductByDescID(int index, String txt, String categoryID) {
        List<product> listP = new ArrayList<>();
        String query = "with temp as \n"
                + "(select ROW_NUMBER() over (order by productID desc) as row,* from Product_HE153663_SE1606\n"
                + "where [name] like ? and categoryID like ? and available =1)\n"
                + "select * from temp where row between ?*9-8 and ?*9"
                + "order by productID desc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + categoryID + "%");
            ps.setInt(3, index);
            ps.setInt(4, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                listP.add(new product(rs.getInt(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listP;
    }

    public List<product> getPoductByAscPrice(int index, String txt, String categoryID) {
        List<product> listP = new ArrayList<>();
        String query = "with temp as \n"
                + "(select ROW_NUMBER() over (order by productID desc) as row,*, price-price*sale/100 as 'newprice' "
                + "from Product_HE153663_SE1606\n"
                + "where [name] like ? and categoryID like ? and available = 1)\n"
                + "select * from temp where row between ?*9-8 and ?*9"
                + "order by newprice asc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + categoryID + "%");
            ps.setInt(3, index);
            ps.setInt(4, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                listP.add(new product(rs.getInt(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listP;
    }

    public void updateQuantity(String productID, int quantity) {
        String query = "update product_HE153663_SE1606 set quantity =? where productID = ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, quantity);
            ps.setString(2, productID);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addProduct(String name, String available, String description,
            String imgLink, String categoryID, String quantity, String price, String sale) throws ClassNotFoundException {
        String query = "INSERT INTO Product_HE153663_SE1606 VALUES (?,?,?,?,?,?,?,?)";
        try {

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, available);
            ps.setString(3, description);
            ps.setString(4, imgLink);
            ps.setString(5, categoryID);
            ps.setString(6, quantity);
            ps.setString(7, price);
            ps.setString(8, sale);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateProduct(String productID, String name, String available, String description,
            String imgLink, String categoryID, String quantity, String price, String sale) throws ClassNotFoundException {
        String query = "UPDATE Product_HE153663_SE1606\n"
                + "   SET [name] =? \n"
                + "      ,[available] = ?\n"
                + "      ,[description] = ?\n"
                + "      ,[img] = ?\n"
                + "      ,[categoryID] =?\n"
                + "      ,[quantity] = ?\n"
                + "      ,[price] =?\n"
                + "      ,[sale] = ?\n"
                + " WHERE productID =?";
        try {

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, available);
            ps.setString(3, description);
            ps.setString(4, imgLink);
            ps.setString(5, categoryID);
            ps.setString(6, quantity);
            ps.setString(7, price);
            ps.setString(8, sale);
            ps.setString(9, productID);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public int getTop1ID() {
        String query = "SELECT TOP(1) productID FROM Product_HE153663_SE1606  ORDER BY productID desc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public void deleteProduct(String productID) {
        String query = "delete from Product_HE153663_SE1606 where productID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, productID);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getSaleP(String productID) {
        String query = "select sale from Product_HE153663_SE1606 where productID = ? and available =1";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, productID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public List<product> getBigDiscount() {
        List<product> listP = new ArrayList<>();
        String query = "select top 3 * from Product_HE153663_SE1606 where available =1 order by sale desc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listP.add(new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listP;
    }

    public List<product> getAll() {
        List<product> listP = new ArrayList<>();
        String query = "select* from Product_HE153663_SE1606";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listP.add(new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listP;
    }
}
