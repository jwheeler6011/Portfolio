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
import java.lang.Math;

public class Roman 
{
    
    public static String intToRoman (int n)
    {
        String t = null;
        StringBuilder sb = new StringBuilder();
        
        if (n == 1)
        {
            t = "I";
        }
        
        else if (n<4)
        {
            sb.append("I"+intToRoman(n-1));
            t = sb.toString();
        }
        
        else if (n==5)
        {
            t = "V";
        }
        
        else if (3<n && n<9)
        {
            int a = n-5;
            int b = Math.abs(a);
            
           if (a<0)
           {
               sb.append(intToRoman(b)+intToRoman(5));
           }//end if
           
           else
           {
               sb.append(intToRoman(5)+intToRoman(a));
           }
           
           t = sb.toString();
            
        }//end else if
        
        else if (n==10)
        {
            t = "X";
        }
        
        else if (n>8 && n<20)
        {
            int a = n-10;
            int b = Math.abs(a);
            
            if (a<0)
            {
                sb.append(intToRoman(b)+intToRoman(10));
            }
            
            else
            {
                sb.append(intToRoman(10)+intToRoman(a));
            }
            
            t = sb.toString();
            
        }//end else if
        
        if (n % 10 == 0 && n<40)
        {
            int a = n/10;
            
            for (int i = 0; i<a; i++)
            {
                sb.append("X");
                //System.out.println(a);
                
            }//end for loop
            
            t = sb.toString();
            
            
        }
        
        else if (n>20 && n<40)
        {
            
        }
        
        return t;
    }//end method
    
    
    
    public static void main (String [] args)
    {
        String thing = intToRoman(39);
        System.out.println(thing);
    }//end main
    
}
