class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Step 1: Handle edge cases \U0001f6e1️
        if (head == null || head.next == null || k == 0) {
            return head; // Nothing to rotate, return as is
        }

        // Step 2: Find the length of the list and the tail node \U0001f4cf
        ListNode tail = head;
        int length = 1; // Start at 1 because we already have the head
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

       
        tail.next = head;
        k = k % length; 
        if (k == 0) {
            tail.next = null; // If k is a multiple of length, no change
            return head;
        }
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next; 
        }
        ListNode newHead = newTail.next; 
        newTail.next = null; 
        return newHead;
    }
}