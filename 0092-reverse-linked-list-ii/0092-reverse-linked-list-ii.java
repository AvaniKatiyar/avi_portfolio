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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){return head;}
        ListNode prev=null;
        ListNode present=head;
        for(int i=0;present!=null&&i<left-1;i++)
        {
            prev=present;
            present=present.next;
        }
        ListNode last=prev;
        ListNode start=present;
        ListNode next=null;
        ListNode previ=null;
        for(int i=0 ; present!=null && i<(right-left)+1 ; i++)
        {
          next=present.next;
          present.next=previ;
          previ=present;
          present=next; 

        }
        if(last!=null)
        last.next=previ;
        else head=previ;
        start.next=present;
        return head;
    }
}