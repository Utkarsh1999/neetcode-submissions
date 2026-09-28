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

        ListNode head = new ListNode(0);
        ListNode curr = head;

        while(list1!=null && list2!=null) {
            if(list1.val > list2.val) {
                curr.next = list2;
                list2 = list2.next;
            } else {
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }
        
    
        // if any element is left in list1
        if (list1!=null) {
            curr.next = list1;
        }

        if (list2!=null) {
            curr.next = list2;
        }

        return head.next;
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

    return curr.next;
*/