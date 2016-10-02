/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode pre=head,fast=head,slow=head;
        while(fast!=null &&fast.next!=null){
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;    //divide into n/2
        }
        pre.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);
        return merge(l1,l2);
    }
    private ListNode merge(ListNode l1,ListNode l2){
        ListNode p=new ListNode(0), nextNode=p;
        while (l1!=null &&l2!=null){
            if(l1.val<l2.val){
                nextNode.next=l1;
                l1=l1.next;
            }
            else{
                nextNode.next=l2;
                l2=l2.next;
            }
            nextNode=nextNode.next;
        }
        if(l1!=null){
           nextNode.next=l1; 
        }
        if(l2!=null){
            nextNode.next=l2;
        }
        return p.next;
    }
}
