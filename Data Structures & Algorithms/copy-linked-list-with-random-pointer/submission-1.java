/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head==null) {
            return null;
        }

        Node curr = head;
        //add new node next to current node in the existing linkedlist
        while(curr!=null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next=newNode;

            curr = newNode.next;
        }

        //add random pointers to new node
        curr = head;
        // Node newCurr = curr.next;

        while(curr!=null) {//check for null scenario where curr.random == null
            Node newNode = curr.next;
            if(curr.random!=null) {
                newNode.random = curr.random.next;
            }

            
            curr = newNode.next;
            // newCurr = curr.next;
        }

        // seperating 2 linked lists
        curr = head;
        
        Node newHead = curr.next;
        
        while(curr!=null) {
            Node newNode = curr.next;

            curr.next = newNode.next;

            if(newNode.next!=null) {
                newNode.next = newNode.next.next;
            }
            curr = curr.next;

        }

        return newHead;
    }
}
/*
    
*/
