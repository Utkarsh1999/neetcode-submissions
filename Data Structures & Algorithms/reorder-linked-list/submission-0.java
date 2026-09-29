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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        // find mid
        ListNode midPoint = findMid(head);

        //seperate 2 list
        ListNode next = midPoint.next;
        midPoint.next = null;

        //reverse the second list
        ListNode reversedHead = reverseLL(next);

        ListNode curr = head;
        while(reversedHead!=null) {
            ListNode next1 = curr.next;
            ListNode next2 = reversedHead.next;

            curr.next = reversedHead;
            reversedHead.next = next1;

            curr = next1;
            reversedHead = next2;

        }

    }

    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }

        return prev;

    }
}
/*
            0 1 2 3
    head = [2,4,6,8]

    [2,4,6,8]
    [8,6]

    [2,8,4,6]

    [0,n,1,n-1,2,n-2....]
    [2,8,4,6]

     - find the mid point
     - reverse the second half of linked list
     - start merging both the list 
        - i.e. start from the head, pick 1 element and pick 1 element from reversed list
        - keep on doing so until we reached end of either of the list
        - return the new head

*/
