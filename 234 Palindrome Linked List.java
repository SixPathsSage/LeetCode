/**
 * https://leetcode.com/problems/palindrome-linked-list/
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
    public boolean isPalindrome(ListNode head) {
        int length = length(head);
        ListNode mid = head;
        
        for(int i = 0; i < length/2; i ++) {
            mid = mid.next;
        }
        
        if(length % 2 == 1) {
            mid = mid.next;
        }
        
        ListNode reversed = reverse(mid);
        while(reversed != null) {
            if(head.val != reversed.val) {
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        
        return true;
    }
    
    private int length(ListNode node) {
        int length = 0;
        
        while(node != null) {
            node = node.next;
            length ++;
        }
        
        return length;
    }
    
    private ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}