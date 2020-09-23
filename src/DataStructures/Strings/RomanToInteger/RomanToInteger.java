package DataStructures.Strings.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;
        char prev = ' ';

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            total += values.get(curr);

            if ((prev == 'I' && (curr == 'V' || curr == 'X')) ||
                    (prev == 'X' && (curr == 'L' || curr == 'C')) ||
                    (prev == 'C' && (curr == 'D' || curr == 'M')))  {
                total -= values.get(prev) * 2;
            }

            prev = curr;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }
}
