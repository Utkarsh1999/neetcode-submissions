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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        if(l1 == null) {
            return l2;
        }

        if(l2==null) {
            return l1;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        while(l1!=null && l2!=null) {
            int total = l1.val+l2.val+carry;

            ListNode temp = new ListNode(total%10);
            curr.next = temp;
            carry = total/10;
            curr = curr.next;

            l1 = l1.next;
            l2 = l2.next;
            
        }

        
        while(l1!=null) {
            int total = l1.val+carry;
            carry = total/10;
            
            ListNode temp = new ListNode(total%10);
            curr.next = temp;
            curr = curr.next;

            l1 = l1.next;
        }

        while(l2!=null) {
            int total = l2.val+carry;
            carry = total/10;
            
            ListNode temp = new ListNode(total%10);
            curr.next = temp;
            curr = curr.next;

            l2 = l2.next;
        }

        if(carry>0) {
            curr.next = new ListNode(carry);
        }
        


        return dummyHead.next;

    }
}
/*
    l1 = [1,7,4], - 471 
    l2 = [4,5,6] -  654

    l3 = [5,2,1,1]
*/
