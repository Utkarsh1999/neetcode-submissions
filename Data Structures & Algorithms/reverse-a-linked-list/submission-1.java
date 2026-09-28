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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null;
        while(curr!=null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
/*
    head = [0,1,2,3]

    0 -> 1 -> 2 -> 3
    0 -> 1 -> 2 ->null
    curr = head = 0
    while curr!=null: 0,1,2,3
        next = curr.next = 1,2,3,null
        curr.next = prev = null,0,1,2
        prev=curr = 0,1,2,3
        curr = next = 1,2,3,null




    ListNode curr = head, prev = null;
        while(curr!=null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }



*/