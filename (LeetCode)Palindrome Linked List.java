//Problem: https://leetcode.com/problems/palindrome-linked-list/description/
//Time Comp O(n)
//Space Comp O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null)
        return true;
       
       ListNode secondhalf=null;
       ListNode prev=null;
       ListNode temp=head;
       ListNode slowptr=head;
       ListNode fastptr=head;
       
       while(fastptr!=null && fastptr.next!=null)
       {
           prev=slowptr;
           slowptr=slowptr.next;
           fastptr=fastptr.next.next;
       }
       
       if(fastptr==null)
       {
           prev.next=null;
           secondhalf=slowptr;
       }
       
       else
       {
           prev.next=null;
           secondhalf=slowptr.next;
       }
       
       ListNode val=reverse(secondhalf);
       
       while(temp!=null)
       {
          if(temp.val!=val.val)
          return false;
          
          else
          {
              temp=temp.next;
              val=val.next;
          }
       }
       return true; 
        
    }
    
    static ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode nexter=head;
        ListNode prev=null;
        
        while(curr!=null)
        {
            curr=curr.next;
            nexter.next=prev;
            prev=nexter;
            nexter=curr;
        }
        
        return prev; 
    }
}
