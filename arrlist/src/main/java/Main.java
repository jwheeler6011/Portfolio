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
     public static void main (String args[])
     {
         Data data = new Data(1,"Mo Black", 44, 5555);
         Data dat2 = new Data(2,"Joe Black",45, 5556);
         
         ArrayList<Data> list = new ArrayList<>();
         
         list.add(data);
         list.add(dat2);
         
         Data theDat = list.get(0);
         Data theDat2 = list.get(1);
         
         theDat.printValues();
         theDat2.printValues();
     }
    
}
