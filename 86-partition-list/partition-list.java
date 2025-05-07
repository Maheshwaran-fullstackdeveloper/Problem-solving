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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode prev1 = dummy1;
        ListNode prev2 = dummy2;
        while(head != null) {
            if(head.val < x) {
                prev1.next = head;
                prev1 = prev1.next;
            }
            else {
                prev2.next = head;
                prev2 = prev2.next;
            }
            head = head.next;
        }
        prev2.next = null;
        prev1.next = dummy2.next;
        head = dummy1.next;
        return dummy1.next;
    }
}