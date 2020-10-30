/**
 * Name: (141) Linked List Cycle
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/linked-list-cycle/
 * Comment:
 * - Use two pointers, walker and runner.
 * - walker moves step by step. runner moves two steps at time.
 * - if the Linked List has a cycle walker and runner will meet at some point.
 * O(n) Time and O(1) Space complexity.
 * */
package DataStructures.LinkedList.CycleInLinkedList;

public class CycleInLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}
