/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode p1 = a;
        ListNode p2 = b;

    while (p1 != p2) {

        if (p1 == null) {
            p1 = b;
        } else {
            p1 = p1.next;
        }

        if (p2 == null) {
            p2 = a;
        } else {
            p2 = p2.next;
        }
    }

    return p1;
    }
}