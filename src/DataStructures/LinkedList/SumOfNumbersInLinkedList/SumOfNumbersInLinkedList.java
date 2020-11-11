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
        ListNode headToReturn = l1;

        int carry = 0;
        int sum = 0;

        while (l1 != null  || l2 != null || carry == 1) {
            sum = carry;
            sum += (l1 != null) ? l1.val : 0;
            sum += (l2 != null) ? l2.val : 0;

            carry = (sum > 9) ? 1 : 0;
            if (l1 == null) l1 = new ListNode(sum % 10);
            else l1.val = sum % 10;

            System.out.println(sum + " " + carry + " " + l1.val);

            if (l1 != null) {
                if (l1.next == null && carry == 1) {
                    l1.next = new ListNode(1);
                    l1 = l1.next;
                }
                l1 = l1.next;
            }

            if (l2 != null) {
                if (l2.next == null && carry == 1) {
                    l2.next = new ListNode(1);
                    l2 = l2.next;
                }
                l2 = l2.next;
            }
        }

        return headToReturn;
    }
}
