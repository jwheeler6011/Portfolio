/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.userclass;

import java.sql.*;

/**
 *
 * @author 16312
 */
public class CustomerController 
{
    String url = "jdbc:mysql://localhost:3306/Local instance MySQL80";
    String un = "root";
    String pw = "password";
    Connection conn = null;
    
    public void dbConn(Customer cust) throws SQLException
    {
         try 
    {
        conn = DriverManager.getConnection(url, un, pw);
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("INSERT INTO sys.customer (FirstName, LastName, emailAddress, username, password, paymentMethod, phoneNumber, LicensePlate, Make, Model, Color)"
                + "VALUES ("+cust.firstName()+","+cust.lastName()+",)");
        
    }
    
    catch (SQLException e)
    {
        e.printStackTrace();
    }
                
    }//end method
    
   
    
    

    
    
    
    
    

     
     
}//end class
     
