/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author vinh2
 */
public class account {

    private int accID;
    private String email;
    private String phone;
    private String fullname;
    private String securityQ;
    private String answer;
    private String username;
    private String password;
    private boolean isAdmin;
    private boolean isCustomer;

    public account() {
    }

    public account(int accID, String email, String phone, String fullname, String securityQ, String answer, String username, String password, boolean isAdmin, boolean isCustomer) {
        this.accID = accID;
        this.email = email;
        this.phone = phone;
        this.fullname = fullname;
        this.securityQ = securityQ;
        this.answer = answer;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isCustomer = isCustomer;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSecurityQ() {
        return securityQ;
    }

    public void setSecurityQ(String securityQ) {
        this.securityQ = securityQ;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isIsCustomer() {
        return isCustomer;
    }

    public void setIsCustomer(boolean isCustomer) {
        this.isCustomer = isCustomer;
    }

   

}
