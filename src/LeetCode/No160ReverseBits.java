/**
 * Name: (160) Reverse Bit
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/reverse-bits/
 */
package LeetCode;

public class No160ReverseBits {
    // Treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1; // Bitwise AND
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }
}
