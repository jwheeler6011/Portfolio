package com.mycompany.nodesum;


import java.util.*;
 
//Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; } //create class where data is an int
      ListNode(int val, ListNode next) { this.val = val; this.next = next; } //we then have a pointer
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) //a method that adds 2 nodes
    {
      //ListNodeIterator<String> Iterator = l1.next();
      ArrayList<Integer> numbers1 = new ArrayList<Integer>();
      ArrayList<Integer> numbers2 = new ArrayList<Integer>();
      ArrayList<Integer> Rnumber1 = new ArrayList<Integer>();
      ArrayList<Integer> Rnumber2 = new ArrayList<Integer>();
      
      ListNode temp = new ListNode(); //this class treats the two numbers in the node like 2 digit, so this ensures the correct number is the sum
      ListNode l3 = new ListNode();
      int sum = 0;
      int carry = 0;
      
      
      while (l1!=null || l2!=null) //check that both values are not null
      {
          //temp = l3;
          sum=carry+l1.val+l2.val;
          
          
          if (sum>=10)
          {
          carry = 1;
          sum = sum % 10;
          }
          else
          carry = 0;
          
          //System.out.println(sum);
          
          //System.out.println("temp "+temp.val);
          l3.val = sum;
          l3.next = temp;
          System.out.println("l3.val "+l3.val);
          //l3.next = temp;
          temp = l3;
          System.out.println("this is l3.val.next "+l3.next.val);
          
          l1 = l1.next;
          l2 = l2.next;
      }
      
       //for (int x = 0; x<3; x++)
      //{
        //     numbers1.add(l1.val);
          //   numbers2.add(l2.val);
             
          
          
          
      //}//end while
      
     
      
      /*while (l1.next !=null)
      {
          numbers1.add(l1.val);
      }
      
      while (l2.next !=null)
      {
          numbers2.add(l2.val);
      }*/
      
      //int j = 0;
      int k = 0;
      int m = 1;
      int n = 1;
      
      /*for (int j = numbers1.size();i>0; i--)
      {
          
          k+=numbers1.get(i)*m; //adding a total of all numbers in numbers1 to j..j will become that value
          m = m*10;
          
      }
      
      for (int i = numbers2.size();i>0;i--)
      {
          k+=numbers2.get(i)*n;
          n = n*10;
      }
      
      int f = j+k;
      
      String str = Integer.toString(f);
      
      for (int i = str.length(); i>0; i--)
      {
          int val = Character.getNumericValue(str.charAt(i));
          
          ListNode theNode = new ListNode(val, null);
      }*/
      
      
      return l3;
        
    }
   
}