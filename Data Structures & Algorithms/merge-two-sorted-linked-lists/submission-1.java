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

        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }

        ListNode  curNode = new ListNode(0);
        ListNode  prevNode = curNode;

        while(list1!=null || list2!=null){
            int val1 = list1 != null ? list1.val : Integer.MAX_VALUE;
            int val2 = list2 != null ? list2.val : Integer.MAX_VALUE;

            if(val1 < val2){
                    curNode.next = new ListNode(list1.val, null);
                    list1 = list1.next;
                }else{
                    curNode.next = new ListNode(list2.val, null);
                    list2 = list2.next;
                }
                curNode = curNode.next;
        }

        return prevNode.next;
        
    }
}