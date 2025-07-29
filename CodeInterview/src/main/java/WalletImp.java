
import java.util.Collection;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16312
 */
public class WalletImp implements Wallet
{
    ArrayList<Long> coins = new ArrayList<>();

    @Override
    public void load(String filename) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //int [] coins = null;
        
        //int i = 0;
        
        
        try {
            File file = new File(filename);
            Scanner theReader = new Scanner(file);

            while (theReader.hasNextLine()) {
                String data = theReader.nextLine();
                long theCoin = Integer.parseInt(data);
                coins.add(theCoin);
                //System.out.println(data);
                //i++;
                //take each number...convert to int, add to data structure, array?

            }//end while
        }//end try
        catch (Exception e) 
        {
            //System.out.println("No such file exists");
            e.printStackTrace();
        }
    }//end load

    @Override
    public Long getBalance() 
    {
        //need to do for loop, that adds up all numbers and that is our answer
        long res = 0;
        
        for (int i = 0; i<coins.size(); i++)
        {
            res+=coins.get(i);
        }//end for loop
        
        return res;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Long> peek() 
    {
        //coins.toString();
        return coins;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //void load ()
    
}
