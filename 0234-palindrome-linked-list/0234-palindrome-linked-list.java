/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
       ListNode mid=middlenode(head);
       ListNode secondhead=reverse(mid);

       while(head!=null && secondhead!=null)
       {
          if(head.val!=secondhead.val)
          break;
          head=head.next;
          secondhead=secondhead.next;

       } 
       if(head==null || secondhead==null)
       {
        return true;
       }
       else {return false;}
    }
    public ListNode reverse(ListNode mid)
    {
       ListNode prev=null;
       ListNode present=mid;
       ListNode next=null;
        while(present!=null)
        {
          next=present.next;
          present.next=prev;
          prev=present;
          present=next;
        }  
        return prev;
    }
    public ListNode middlenode(ListNode head)
    {
       ListNode slow=head;
      ListNode fast=head;
      while(fast.next!=null && fast.next.next!=null)
      {
        slow=slow.next;
        fast=fast.next.next;
      }
      if(fast.next==null)
      {
        return slow;
      }  
      else {return slow.next;}
      }
    
}