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

        ListNode curr3 = new ListNode(0);
        ListNode head3 = curr3;
        ListNode head1 = list1;
        ListNode head2 = list2;

        while(head1!=null && head2!=null) {
            if(head1.val > head2.val) {
                head3.next = new ListNode(head2.val);
                head3 = head3.next;
                head2 = head2.next;
            } else {
                head3.next = new ListNode(head1.val);
                head3 = head3.next;
                head1 = head1.next;
            }
        }
        
    
        // if any element is left in list1
        while(head1!=null) {
            head3.next = new ListNode(head1.val);
            head3 = head3.next;
            head1 = head1.next;
        }

        while(head2!=null) {
            head3.next = new ListNode(head2.val);
            head3 = head3.next;
            head2 = head2.next;
        }

        return curr3.next;
    }
}
/*
    list1 = [1,2,4],
             ^ 
    list2 = [1,3,5]
             ^
    while(list1!=null && list2!=null)
        if(list1.val > list2.val) {
            list3.val = new ListNode(list2.val);
            list3 = list3.next;
            list2 = list2.next;
        } else {
            list3.val = new ListNode(list1.val);
            list3 = list3.next;
            list1 = list1.next;
        }
    
    // if any element is left in list1
    while(list1!=null) {
        list3.val = new ListNode(list1.val);
        list3 = list3.next;
        list1 = list1.next;
    }

    while(list2!=null) {
        list3.val = new ListNode(list2.val);
        list3 = list3.next;
        list2 = list2.next;
    }

    return head3.next;
*/