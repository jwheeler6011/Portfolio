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
public interface VendingMachine 
{
    void displayProducts();
    void selectProduct(int product);
    void displayEnterCoins();
    void enterCoins(int [] coins); //each int represents coins passed
    //void displayChangeMessage();
    
    
}
