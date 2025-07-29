/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vm;

import java.util.Scanner;

/**
 *
 * @author 16312
 */
public class Main 
{
    
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        VendingMachine vm = new TextBasedVendingMachine();
        vm.displayProducts();
        String selectedProduct = sc.nextLine();
        vm.displayEnterCoins();
        
        
        int sPn = Integer.parseInt(selectedProduct); //cast selected product to Int
        vm.selectProduct(sPn);
        
        String enteredCoins = sc.nextLine();
        int eC = Integer.parseInt(enteredCoins); //convert coins entered by user
        int [] eC2 = {}; //convert entry to array
        
        vm.enterCoins(eC2);
        //vm.displayChangeMessage();
        
    }
    
}
