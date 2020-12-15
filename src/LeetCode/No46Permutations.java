package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class No46Permutations {
    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> list = new ArrayLisst<>();
            List<Integer> tree = new ArrayList<> ();
            recursive(list, tree, nums);
            return list;
        }

        private void recursive(List<List<Integer>> list, List<Integer> tree, int[] nums) {
            if (tree.size() == nums.length) {
                list.add(new ArrayList<> (tree));
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if (tree.contains(nums[i])) continue;
                    tree.add(nums[i]);
                    recursive(list, tree, nums);
                    tree.remove(tree.size() - 1);
                }
            }
        }
    }
}
