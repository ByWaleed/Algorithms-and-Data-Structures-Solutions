/**
 * Name: (234) Palindrome Linked List (singly)
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/palindrome-linked-list/
 * Challenge: Do it in O(n) time and O(1) space.
 * Comments: First use two pointers (p1 & p2), where p2 always jumps double, to iterate through the linked list and find
 * the middle node(s). Also, change direction for the first half of the list, so it could be traversed form mid to start.
 * Then use a third pointer (starting at head) to compare with p2 (the remaining half of the list).
 * */

package DataStructures.LinkedList.PalindromeLinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PalindromeLinkedList {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        if (head.next == null) return true;

        ListNode p1 = head;
        ListNode p2 = head;
        ListNode p3 = null;

        ListNode temp = null;

        while (p2.next != null) {
            if (p2.next.next != null)
                p2 = p2.next.next;
            else {
                break;
            }

            temp = p1.next;
            p1.next = p3;

            p3 = p1;
            p1 = temp;
        }

        if (p2.next != null) {
            // Shift forward both P1 and P2, so they are centered.
            temp = p1.next;
            p1.next = p3;

            p3 = p1;
            p1 = temp;
        } else {
            // Shift forward only P1 becuase of the odd number of nodes in the list.
            p1 = p1.next;
        }

        while (p1 != null) {
            if (p1.val != p3.val) return false;
            p3 = p3.next;
            p1 = p1.next;
        }

        return true;
    }
}
