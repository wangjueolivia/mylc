/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode fast=pre;
        ListNode slow=pre;
        int i;
        for(i=0;fast.next!=null;i++){
            fast=fast.next;
        }
        for(int j=i-k%i;j>0;j--){
            slow=slow.next;
        }
        fast.next=pre.next;
        pre.next=slow.next;
        slow.next=null;
        return pre.next;
    }
}
