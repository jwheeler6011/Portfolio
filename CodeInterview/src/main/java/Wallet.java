/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16312
 */
import java.util.*;
import java.io.*;

interface Wallet {
    // Iteration 1    /**     * Load money into my wallet (denominations of any size are acceptable).     */

    void load(String filename);
    
    //need to write a file buffered stream...string has to be the filepath

    /**
     * * Return current balance of my wallet
     */
    Long getBalance();

    /**
     * * Return the coins in the wallet. * (peek does NOT need to be performant
     * as to be used solely for testing)
     */
    Collection<Long> peek();     
}