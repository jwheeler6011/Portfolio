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
public class TextBasedVendingMachine implements VendingMachine 
{
    private int selectedProduct;
    
    @Override public void displayProducts()
    {
        System.out.println("Welcome to the Vending Machine");
        System.out.println("Products Available:");
        
        for (Product product: Product.values())
        {
            System.out.println("   "+product.getID()+" "+product.name()+" Price: "+product.getPrice());
            
        }//end for
        
        System.out.println(" ");
        System.out.println("Please select your product:");
    }//end displayProducts
    
    @Override public void selectProduct(int prd)
    {
        this.selectedProduct = prd;
    }//end selectProduct
    
    @Override public void displayEnterCoins()
    {
        System.out.println("Insert coins(s)");
    }
    
    @Override public void enterCoins (int [] coins)
    {
        Calculator calc = null;
        
        
    }//end ec
}
