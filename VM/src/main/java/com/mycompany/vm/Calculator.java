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
public interface Calculator 
{
    int calculateTotal(CoinBundle enteredCoins); //returns total amount in cents
    CoinBundle calcChange(int amtToReturn);
    
    
}
