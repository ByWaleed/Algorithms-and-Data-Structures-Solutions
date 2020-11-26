package LeetCode;

public class No104MaximumDepthOfBinaryTree {
     private static class TreeNode {
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

    public static class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;

            int depth = 0;

            if (root.left != null) depth += maxDepth(root.left);

            if (root.right != null) {
                int rightDepth = maxDepth(root.right);
                if (rightDepth > depth) depth = rightDepth;
            }

            return depth + 1;
        }
    }
}
