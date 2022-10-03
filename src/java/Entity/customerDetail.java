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
public class customerDetail {
    private int customerID;
    private String payment;
    private String name;
    private String phoneNumber;
    private String firstName;
    private String surName;
    private String lastName;
    private String address;
    private String streetNumber;
    private int orderID;
    private String note;

    public customerDetail() {
    }

    public customerDetail(int customerID, String payment, String name, String phoneNumber, String firstName, String surName, String lastName, String address, String streetNumber, int orderID, String note) {
        this.customerID = customerID;
        this.payment = payment;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.surName = surName;
        this.lastName = lastName;
        this.address = address;
        this.streetNumber = streetNumber;
        this.orderID = orderID;
        this.note = note;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
