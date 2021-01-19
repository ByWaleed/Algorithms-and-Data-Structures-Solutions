/**
 * Name: (94) Binary Tree Inorder Traversal
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/binary-tree-inorder-traversal/
 * Notes: Recursive method with a list parameter used for building the traversal list and returned for after each recursion.
 */
package LeetCode;

import java.util.ArrayList;s
import java.util.List;

public class No94BinaryTreeTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        return traverse(root, new ArrayList<Integer>());
    }

    private List<Integer> traverse(TreeNode root, List<Integer> list) {
        if (root == null) return list;

        list = traverse(root.left, list);
        list.add(root.val);
        list = traverse(root.right, list);

        return list;
    }
}
