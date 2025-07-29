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
public class CoinBundle 
{
    public int number5CentCoins;
    public int number10CentCoins;
    public int number20CentCoins;
    public int number50CentCoins;
    public int number100CentCoins;
    
    public CoinBundle(int [] eC)
    {
        this.number5CentCoins = eC[0];
        this.number10CentCoins= eC[1];
        this.number20CentCoins= eC[2];
        this.number50CentCoins= eC[3];
        this.number100CentCoins=eC[4];
    }
    
}
