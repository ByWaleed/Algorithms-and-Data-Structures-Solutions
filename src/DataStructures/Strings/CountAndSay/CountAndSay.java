package DataStructures.Strings.CountAndSay;

public class CountAndSay {
    public String countAndSay(int n) {
        return say("1", 1, n);
    }

    private String say(String s, int curr, int n) {
        if (curr >= n) return s;

        int count = 0;
        char prev = ' ';
        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            if (prev == s.charAt(i)) {
                count++;
            } else {
                if (count > 0) {
                    newString += count + "" + prev;
                }
                prev = s.charAt(i);
                count = 1;
            }
        }

        newString += count + "" + prev;

        return say(newString, curr + 1, n);
    }
}
