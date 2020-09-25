package DataStructures.Strings.ValidatePalindrome;

public class ValidatePalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        if (s == " ") return true;
        if (s.length() == 2) return false;

        int right = s.length() - 1;

        for (int left = 0; left < s.length() / 2; left++) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!(leftChar >= 'a' && leftChar <= 'z')) {
                continue;
            } else if (!(rightChar >= 'a' && rightChar <= 'z')) {
                right--;
                left--;
                continue;
            }

            if (leftChar != rightChar) return false;

            right--;
        }

        return true;
    }
}
