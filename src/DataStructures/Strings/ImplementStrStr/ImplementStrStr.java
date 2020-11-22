/**
 * Name: (28) Implement strStr()
 * Platform: LeetCode
 * URL: https://leetcode.com/problems/implement-strstr/
 * Comment: O(n)
 * */
package DataStructures.Strings.ImplementStrStr;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
