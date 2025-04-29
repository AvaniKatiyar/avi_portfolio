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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=null;
        ListNode temp=null;
        int num;
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
              num=list1.val; 
              list1=list1.next; 
            }
            else
            {num=list2.val;
            list2=list2.next;}
            ListNode newnode= new ListNode(num);
            if(head==null)
            {
              head=temp=newnode;
            }
            else {
                temp.next=newnode;
                temp=temp.next;
            }
        }
        if(list1==null &&list2!=null)
        {
            while(list2!=null)
            {
           num=list2.val;
           list2=list2.next;
           ListNode newnode= new ListNode(num);
            if(head==null)
            {
              head=temp=newnode;
            }
            else {
                temp.next=newnode;
                temp=temp.next;
            }
            }
        }
        else 
        {
           while(list1!=null)
           {
           num=list1.val;
           list1=list1.next;
           ListNode newnode= new ListNode(num); 
           if(head==null)
            {
              head=temp=newnode;
            }
            else {
                temp.next=newnode;
                temp=temp.next;
            } 
         }
        }
        return head;
    }
}