/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.userclass;

/**
 *
 * @author 16312
 */
public interface User 
{
    public String firstName();
    public String lastName();
    public String emailAddress();
    public String userName();
    public String password();
    public String PaymentMethod();
    public int pn();
    public String address();
    public void setFirstName(String fName);
    public void setLastName(String lName);
    public void setEmail(String email);
    public void setUserName(String u);
    public void setPassword (String p);
    public void setPhone (int ph);
    public void setAddy (String add);
    public void setPM (String payment);
    
}
