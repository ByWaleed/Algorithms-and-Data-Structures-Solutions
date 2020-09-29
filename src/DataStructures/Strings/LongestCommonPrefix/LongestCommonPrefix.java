package DataStructures.Strings.LongestCommonPrefix;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
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
}
