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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        for(int i=0;i<n+1 && second!=null; i++) {
            second = second.next;
        }

        while(second!=null) {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;
        return dummy.next;
    }
}
/*
    [1,2,3,4], n = 2
    first = head
    second = head;

    -> move second pointer to nth position from first pointer
    -> move both together till the second reaches the end of the list
    -> now first will be at n+1th position from the last
    -> now remove the next reference of first pointer
*/
