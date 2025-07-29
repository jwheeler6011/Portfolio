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
public enum Product 
{
    TWIX(1,100), COKE(2,50), WATER(3,30), SANDWICH(4,150);
    
    private int id;
    private int price;
    
    Product (int Tid, int Tprice)
    {
        this.id = Tid;
        this.price = Tprice;
        
        
    }//end product
    
    
    public int getID()
    {
        return id;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public static Product productValueOf (int productedSelected)
    {
        for (Product product: Product.values())
        {
            System.out.println(product.price);
        }//end for loop
        
        return null;
    }
}
