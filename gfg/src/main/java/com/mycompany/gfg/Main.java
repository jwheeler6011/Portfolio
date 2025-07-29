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
public class Main 
{
    public static void main (String args[])
    {
        
         int roll[] = { 1, 2, 3, 4 };
        String name[]
            = { "Shubham", "Atul", "Ayush", "Rupesh" };
        int marks[] = { 100, 99, 93, 94 };
        long phone[] = { 8762357381L, 8762357382L,
                         8762357383L, 8762357384L };
 
        // Creating an object of the class
        GFG custom = new GFG();
        
        //ArrayList<GFG> list = new ArrayList<>();
        
 
        // Now calling function to add the values to the
        // arraylist
        custom.addValues(roll, name, marks, phone);
        
    }//end main method
 
   
        
        
    }//end main
