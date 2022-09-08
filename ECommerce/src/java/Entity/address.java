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
public class address {
    private int addressID;
    private int accID;
    private String address;
    private boolean defaultAdd;

    public address() {
    }

    public address(int addressID, int accID, String address, boolean defaultAdd) {
        this.addressID = addressID;
        this.accID = accID;
        this.address = address;
        this.defaultAdd = defaultAdd;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDefaultAdd() {
        return defaultAdd;
    }

    public void setDefaultAdd(boolean defaultAdd) {
        this.defaultAdd = defaultAdd;
    }

  
}
