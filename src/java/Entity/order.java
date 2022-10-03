/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author vinh2
 */
public class order {

    private int userID;
    private int productID;
    private String size;
    private int quantity;
    private int totalMoney;
    private String paymentMethod;
    private Date date;

    public order() {
    }

    public order(int userID, int productID, String size, int quantity, int totalMoney, String paymentMethod, Date date) {
        this.userID = userID;
        this.productID = productID;
        this.size = size;
        this.quantity = quantity;
        this.totalMoney = totalMoney;
        this.paymentMethod = paymentMethod;
        this.date = date;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   

  

    
}
