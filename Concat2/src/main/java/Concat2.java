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


public class Concat2 
{
    public static void main (String [] args)
    {
        StringBuilder sb = new StringBuilder(); //here we simply print out a bunch of a's using the StringBuilder
        
        for (int i = 0; i<100; i++)
        {
            //do something
            sb.append('a');
        }//end loop
        
        String s = sb.toString();
        System.out.println(s);
    }
    
}
