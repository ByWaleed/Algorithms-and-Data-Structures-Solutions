/**
 * Name: (172) Factorial Trailing Zeroes
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/factorial-trailing-zeroes/
 */
package LeetCode;

public class No172FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;

        // Count factors of 5 in n
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }
}
