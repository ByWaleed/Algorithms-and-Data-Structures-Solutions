package DataStructures.Strings.LongestCommonPrefix;

public class LongestCommonPrefix {
    // First solution, Time Complexity of O(n*n)
    public String firstSolution(String[] strs) {
        if (strs.length == 0) return "";

        String first = strs[0];
        boolean end = false;

        int i;
        for (i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() - 1 || strs[j].charAt(i) != c) {
                    end = true;
                    break;
                }
            }

            if (end) break;
        }


        return first.substring(0, i);
    }

    // Second solution: Time Complexity of O(n)
    public String secondSolution(String[] arr) {
        if (arr.length == 0) return "";

        String pref = arr[0]; // prefix, to start with
        int len = pref.length(); // prefix length, to start with

        int i; // declared outside the loop for access after the loop end
        for (i = 1; i < arr.length; i++) {
            String s = arr[i];

            // if prefix length is greater than string length, update prefix length to be string length
            if (len > s.length()) len = s.length();

            // while prefix length is greater than 0 or a prefix has been found in all strings
            while (len > 0) {
                // if prefix match string
                if (s.substring(0, len).equals(pref.substring(0, len))) break; // continue
                else len--; // reduce prefix length
            }

            if (len == 0) return ""; // no common prefix found
        }

        return pref.substring(0, len);
    }
}
