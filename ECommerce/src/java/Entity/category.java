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
public class category {

    private int categoryID;
    private String title;
    private String description;
    private String priceRange;
    private int numberOfProduct;

    public category() {
    }

    public category(int categoryID, String title, String description, String priceRange, int numberOfProduct) {
        this.categoryID = categoryID;
        this.title = title;
        this.description = description;
        this.priceRange = priceRange;
        this.numberOfProduct = numberOfProduct;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }
    

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }
    
}
