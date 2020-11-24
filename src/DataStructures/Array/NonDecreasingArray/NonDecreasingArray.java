/**
 * Name: (665) Non-Decreasing Array
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/climbing-stairs/
 * Comment: Given an array nums with n integers, check if array could become non-decreasing by modifying at most 1 element.
 */
package DataStructures.Array.NonDecreasingArray;

public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;                                                                    //the number of changes
        for(int i = 1; i < nums.length && cnt<=1 ; i++){
            if(nums[i-1] > nums[i]){
                cnt++;
                if(i-2<0 || nums[i-2] <= nums[i])nums[i-1] = nums[i];                    //modify nums[i-1] of a priority
                else nums[i] = nums[i-1];                                                //have to modify nums[i]
            }
        }
        return cnt<=1;
    }
}
