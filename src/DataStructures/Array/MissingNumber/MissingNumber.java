/**
 * Name: (268) Missing Number
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/missing-number/
 * Comments: Better solution would be to use XOR Bit Manipulation, to find the difference between each element in array.
 * */
package DataStructures.Array.MissingNumber;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != i) return i;

        return nums.length;

        // Better Solution
        /*int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;*/
    }
}
