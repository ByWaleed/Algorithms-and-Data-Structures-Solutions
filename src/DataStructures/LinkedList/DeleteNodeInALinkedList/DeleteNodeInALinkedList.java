/**
 * Name: Delete Node in a Linked List
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/delete-node-in-a-linked-list/
 * */
package DataStructures.LinkedList.DeleteNodeInALinkedList;

public class DeleteNodeInALinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    private void DeleteNodeInALinkedList(ListNode node) {
        node.val = node.next.val; // copy next node, to current node
        node.next = node.next.next; // remove next node
    }
}
