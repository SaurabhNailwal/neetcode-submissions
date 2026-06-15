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

        if(head == null || head.next == null){
            return head;
        }

        ListNode prevNode = null;
        ListNode curNode = null;        

        while(head.next != null){

            curNode = new ListNode(head.val, prevNode);     
            prevNode = curNode;
            curNode = head.next;
            head = head.next;

        }

        prevNode = new ListNode(head.val, prevNode);

        return prevNode;
        
    }
}
