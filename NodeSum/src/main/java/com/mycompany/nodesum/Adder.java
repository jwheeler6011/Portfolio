/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nodesum;

/**
 *
 * @author 16312
 */
public class Adder 
{
   public static void main (String [] args) 
    {
        ListNode ln1 = new ListNode(3);
        ListNode ln2 = new ListNode(4,ln1);
        ListNode ln3 = new ListNode(2,ln2);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(6,ln4);
        ListNode ln6 = new ListNode(5,ln5);
        
 Solution test = new Solution ();
 ListNode theNode = test.addTwoNumbers(ln3, ln6);
 //System.out.println(theNode.val);
 //System.out.println(theNode.next.val);
 //System.out.println(theNode.next.next.val);
 
   
        
    }
    
    
}