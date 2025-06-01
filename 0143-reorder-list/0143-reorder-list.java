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
    public ListNode middleNode(ListNode head) {
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
      public ListNode reverseList(ListNode head) {
        ListNode previous= null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode front=temp.next;//keep track of next node 
            temp.next=previous;//reverse the directon
            previous=temp;//update
            temp=front;//update
        }  
        return previous;     
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
        {
            return;
        }
        ListNode mid=middleNode(head);
        ListNode end=reverseList(mid);
        ListNode start=head;
        while(start!=null && end!=null)
        {
            ListNode temp=start.next;
            start.next=end;
            start=temp;

            temp=end.next;
            end.next=start;
            end=temp;
        }
        if(start!=null)
        {
            start.next=null;
        }
    }
}