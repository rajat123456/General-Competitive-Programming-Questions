//Problem-> https://leetcode.com/problems/reverse-nodes-in-k-group/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head==null)
      return head;
      
       ListNode temp=head;
       int counter=0; 
      
      while(temp!=null)
      {
        ++counter;
        
        if(counter==k)
        {
          ListNode nexter=temp.next;
          head=reverse(head,temp);
          temp=head;
          while(temp.next!=null)
          {
            temp=temp.next;
          }
          counter=0;
          temp.next=reverseKGroup(nexter,k);
          return head;
        }
        
        else
          temp=temp.next;
        
      }
      return head;
    }
  
  static ListNode reverse(ListNode head, ListNode tail)
  {
    tail.next=null;
    ListNode curr=head;
    ListNode mid=head;
    ListNode prev=null;
    
    while(curr!=null)
    {
      curr=curr.next;
      mid.next=prev;
      prev=mid;
      mid=curr;
    }
    return tail;
        
    }
}
