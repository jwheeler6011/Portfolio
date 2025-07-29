/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16312
 */
public class Data 
{
    //below we create the values we plan on printing
    int roll;
    String name;
    int marks;
    long phone;
    
    Data (int roll, String name, int marks, long phone) //our constructor
    {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.phone = phone;
    }
    
    public void printValues() //here we create the method that will print a statement on each student
    {
        System.out.println(name+"'s phone number is "+phone+" and their marks are "+marks);
        
    }//end pv
    
}