/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16312
 */

import java.util.ArrayList;

public class Main 
{
    public static void main (String args [])
    {
        WalletImp wi = new WalletImp();
        wi.load("C:\\Users\\16312\\Documents\\coins.txt");
        System.out.println(wi.getBalance());
        
        //Collection<Long> thePeek = wi.peek();
        
        //System.out.println(wi.peek());
        
    }//end main
    
}
