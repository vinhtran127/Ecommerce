/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.List;

/**
 *
 * @author vinh2
 */
public class cart {

    private int cartID;
    private int accID;
    private int productID;
    private String productName;
    private int quantity;
    private int price;
    private String size;
    private String imgLink;

    public cart() {
    }

    public cart(int cartID, int accID, int productID, String productName, int quantity, int price, String size,String imgLink) {
        this.cartID = cartID;
        this.accID = accID;
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.size = size;
        this.imgLink = imgLink;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
