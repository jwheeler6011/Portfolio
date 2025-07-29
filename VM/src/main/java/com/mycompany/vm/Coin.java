/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vm;

/**
 *
 * @author 16312
 */
public enum Coin 
{
    FIVE_CENTS(5), TEN_CENTS(10), TWENTY_CENTS(20), FIFTY_CENTS(50), HUNDRED_CENTS(100);
    
    private int value;
    
    Coin (int val)
    {
        this.value = val;
    }//end Coin
    
    public int getVal ()
    {
        return value;
    }
    
}
