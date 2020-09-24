package DataStructures.Strings.FirstUniqueCharacterInString;

import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        // Solution 1
        // for each lower case characters, loop through the string and see if it's unique.
        // Time Complexity: O(n* 27) & Space Complexity: o(n)

        // Solution 2
        // for each char in string, compare it with the rest of the string.
        // Time Complexity: O(n^2) & Space Complexity: o(n)

        // Solution 3
        // HashMap containing lowercase characters with boolean values, where True means char is repeated.
        // Set latest variable as -1 and will contains the index of first non-repeating character.
        // Loop string backwards with index
        // if character vlaue in HashMap is true; contrinue;
        //  else set latest to current index
        // Time Complexity: O(n^2) & Space Complexity: o(1) - max space of 27 for english alphabets
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}
