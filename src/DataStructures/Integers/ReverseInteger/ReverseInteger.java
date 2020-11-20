/**
 * Name: (7) Reverse Integer
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/reverse-integer/
 * Comments: Remove last bit from integer using Mod while not allowing for 32 bit overflow.
 * */
package DataStructures.Integers.ReverseInteger;

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) return 0;

            rev = rev * 10 + x % 10;

            x = x / 10;
        }

        return rev ;
    }
}
