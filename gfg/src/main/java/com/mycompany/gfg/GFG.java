/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gfg;

import java.util.ArrayList;

/**
 *
 * @author 16312
 */
public class GFG 
{
     // Custom class which has data type class has
    // defined the type of data ArrayList
    // size of input 4
    int n = 4;
 
    // Class 2
    // Inner class
    // The custom datatype class
    class Data {
 
        // Global variables of the class
        int roll;
        String name;
        int marks;
        long phone;
 
        // Constructor has type of data that is required
        Data(int roll, String name, int marks, long phone)
        {
 
            // Initialize the input variable from main
            // function to the global variable of the class
 
            // this keyword refers to current instance
            this.roll = roll;
            this.name = name;
            this.marks = marks;
            this.phone = phone;
        }//end public class
    
}//end Data
    
    
    
     public void addValues(int roll[], String name[],
                          int marks[], long phone[])
    {
        // local custom arraylist of data type
        // Data having (int, String, int, long) type
        // from the class
        ArrayList<Data> list = new ArrayList<>();
 
        for (int i = 0; i < n; i++) 
        {
            // create an object and send values to the
            // constructor to be saved in the Data class
            list.add(new Data(roll[i], name[i], marks[i],
                              phone[i]));
        }
        
        getValue(list,1);
    
    }//end method
     
     
     
    public void getValue(ArrayList<Data> list, int num)
    {
        Data dat = list.get(num);
        
        
        System.out.println(dat.roll + " " + dat.name
                               + " " + dat.marks + " "
                               + dat.phone);
        
        
    }//end method
    
    
    
    
}//end GFG
