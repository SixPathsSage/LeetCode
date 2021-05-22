/**
 * https://leetcode.com/problems/add-two-numbers/
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        
        ListNode alpha = l1;
        ListNode beta = l2;
        ListNode ptr = dummy;
        int carry = 0;
        
        while(alpha != null || beta != null) {
            int alphaVal = alpha != null ? alpha.val : 0;
            int betaVal = beta != null ? beta.val : 0;
            int sum = alphaVal + betaVal + carry;
            carry = sum / 10;
            ptr.next = new ListNode(sum % 10);
            ptr = ptr.next;
            
            if(alpha != null) { alpha = alpha.next; }
            if(beta != null) { beta = beta.next; }
        }
        
        if(carry > 0) {
            ptr.next = new ListNode(carry);
        }
        
        return dummy.next;
    }
}