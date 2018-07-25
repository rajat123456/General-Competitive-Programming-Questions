//Problem-> https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null)
         return head;
      
      ListNode prev=head;
      ListNode curr=head.next;
      
      
      while(curr!=null)
      {
        if(prev.val==curr.val)
        {
          prev.next=curr.next;
          curr.next=null;
          curr=prev.next;
        }
        
        else
        {
          prev=prev.next;
          curr=curr.next;
        }
      }
      
      return head;

        
    }
}
