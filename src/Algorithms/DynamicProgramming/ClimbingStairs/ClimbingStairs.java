/**
 * Name: (70) Climbing Stairs
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/climbing-stairs/
 * Comment: climbStairs(n) = climbStairs(n-1) + climbStairs(n-2)
 */
package Algorithms.DynamicProgramming.ClimbingStairs;

public class ClimbingStairs {
    public int climbStairs(int n) {
        // Solution 1. Time pelanty using recursion
        // if (n == 0 || n == 1) return 1;
        // return climbStairs(n-1) + climbStairs(n-2);

        // Solution 2
        if(n == 1 || n == 2) return n;

        int [] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for(int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n-1];
    }
}
