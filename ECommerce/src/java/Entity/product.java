/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author vinh2
 */
public class product {
    private int productID;
    private String name;
    private boolean available;
    private String description;
    private String img;
    private int categoryID;
    private int quantity;
    private int price;
    private int sale;

    public product() {
    }

    public product(int productID, String name, boolean available, String description, String img, int categoryID, int quantity, int price, int sale) {
        this.productID = productID;
        this.name = name;
        this.available = available;
        this.description = description;
        this.img = img;
        this.categoryID = categoryID;
        this.quantity = quantity;
        this.price = price;
        this.sale = sale;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
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

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

  
}
