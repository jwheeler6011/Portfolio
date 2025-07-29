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
public abstract class Parker implements User 
{
    int lNo; //license number
     
     
    
  
    public int licenseNo()
    {
        return lNo;
    }
    
    public void setLiNo (int liNo)
    {
        this.lNo = liNo;
    }
    
}
