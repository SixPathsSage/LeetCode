/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA == null || headB == null) { return null; }
        
        ListNode alpha = headA;
        ListNode beta = headB;
        
        while(alpha != beta) {
            alpha = alpha == null ? headB : alpha.next;
            beta = beta == null ? headA: beta.next;
        }
        
        return alpha;
    }
}