/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null ||head.next==null){
            return head;
        }
        ListNode first=new ListNode(0);
        first.next=head;
        ListNode pre=first;
        for(int i=1;i<m;i++){
            pre=pre.next;
        }
        ListNode start=pre.next;
        ListNode then=start.next;
        for(int j=0;j<n-m;j++){
            start.next=then.next;
            then.next=pre.next;
            pre.next=then;
            then=start.next;
        }
        return first.next;
    }
}
