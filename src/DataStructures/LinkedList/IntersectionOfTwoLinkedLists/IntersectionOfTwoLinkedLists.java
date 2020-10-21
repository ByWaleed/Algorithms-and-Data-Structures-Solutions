/**
 * Name: (160) Intersection of Two Linked Lists
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Comments: Visual explanation: https://leetcode.com/problems/intersection-of-two-linked-lists/discuss/49785/Java-solution-without-knowing-the-difference-in-len!/165648
 * */
package DataStructures.LinkedList.IntersectionOfTwoLinkedLists;

public class IntersectionOfTwoLinkedLists {

    // Definition for singly-linked list.
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Solution 1: run of O(n^2) and memory o(1)
        // for each node in A
        //   for each node in B
        //     if (A == B) return A
        //     else continue
        //  return null

        //  Solution 2: run of O(n+m) and memory of O(1)
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while(a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }
}
