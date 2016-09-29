/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode slow=pre;
        ListNode fast=head;
        while(fast!=null){
        while(fast.next!=null && fast.val==fast.next.val){
            fast=fast.next;
        }
           if(slow.next==fast){
               slow=slow.next;
           }
           if(slow.next!=fast){
               slow.next=fast.next;
           }
           fast=fast.next;
        }  
        return pre.next;
    }
}
