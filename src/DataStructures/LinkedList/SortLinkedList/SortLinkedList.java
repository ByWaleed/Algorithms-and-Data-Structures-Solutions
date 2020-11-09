/**
 * Name: (148) Sort Linked List (singly)
 * Platform: LeetCode
 * URL: hhttps://leetcode.com/problems/sort-list/
 * Comment: Merge sort algorithm is applied for sorting the nodes. Extra work is done to find the mid point of the list.
 * */
package DataStructures.LinkedList.SortLinkedList;

import DataStructures.LinkedList.ReverseSinglyLinkedList.ReverseSinglyLinkedList;

public class SortLinkedList {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }

    private ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head, mid;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        mid = slow.next;
        slow.next = null;
        return mid;
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1), current = dummyHead;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = l1 != null ? l1 : l2;
        return dummyHead.next;
    }
}
