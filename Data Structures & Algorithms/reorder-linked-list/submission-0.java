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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode middle=slow;
        ListNode curr=middle.next;
        slow.next=null;
        ListNode prev=null;

        while(curr != null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode first=head;
        ListNode second=prev;
        while(first!=null && second!=null){
             ListNode nextFirst = first.next;
            ListNode nextSecond = second.next;
            first.next=second;
            second.next=nextFirst;
            
            first=nextFirst;
            second=nextSecond;
        }
       
    }
}
