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
public abstract class Customer implements User
{
    String lpn; //license plate no.
    String make; //vehicle make
    String model; //vehicle model
    String color;
    
    
  
    
    public String lic ()
    {
        return lpn;
            
    }
    
    public String getMake ()
    {
        return make;
    }
    
    public String getModel ()
    {
        return model;
    }
    
    public String getColor ()
    {
        return color;
    }
    
    
    public void setLPN (String lipn)
    {
        this.lpn = lipn;
    }
    
    public void setMake (String mk)
    {
        this.make = mk;
    }
    
    public void setModel (String mdl)
    {
        this.model = mdl;
    }
    
    public void setColor (String clr)
    {
        this.color = clr;
    }
    
}//end Customer
