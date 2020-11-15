/**
 * Name: (2) Add Two Numbers
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/add-two-numbers
 * Comment:
 * */

package DataStructures.LinkedList.SumOfNumbersInLinkedList;

public class SumOfNumbersInLinkedList {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p = head;
        int c = 0;
        while(p1!=null || p2!=null || c==1){
            int add1 = (p1==null ? 0 : p1.val);
            int add2 = (p2==null ? 0 : p2.val);
            int k = add1 + add2 + c;
            c =  k/10;
            p.next = new ListNode(k%10);
            p = p.next;
            if(p1!=null){p1 = p1.next;}
            if(p2!=null){p2 = p2.next;}
        }
        return head.next;
    }
}
