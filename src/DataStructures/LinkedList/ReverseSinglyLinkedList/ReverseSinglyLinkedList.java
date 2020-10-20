/**
 * Name: (106) Reverse Singly Linked List
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/reverse-linked-list/
 * Comments: Recursive function sets head.next to previous node, till head is null.
 * */
package DataStructures.LinkedList.ReverseSinglyLinkedList;

public class ReverseSinglyLinkedList {

    // Definition for singly-linked list.
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        return reverseNextNode(head, null);
    }

    private ListNode reverseNextNode(ListNode head, ListNode prev) {
        if (head == null) return prev;

        ListNode next = head.next;
        head.next = prev;

        return reverseNextNode(next, head);
    }
}
