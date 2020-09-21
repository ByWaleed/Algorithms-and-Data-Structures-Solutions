package DataStructures.Strings.ValidParenthesis;

class Solution {
    public boolean isValid(String s) {
        // if length of string is odd, return false
        if (s.length() % 2 != 0) return false;

        // Map of closing parenthesis
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')', '(');
        parentheses.put(']', '[');
        parentheses.put('}', '{');

        // Stack conitaining opening parentheses
        Stack st = new Stack();

        // for each character in string as c
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            // if closing paranthesis found
            if (parentheses.containsKey(c)) {
                // if closing bracket doesn't match the popped item or stack empty
                if (st.isEmpty() || parentheses.get(c) != st.pop())
                    // return false
                    return false;

                // else, push to the top of stack
            } else {
                st.push(c);
            }
        }

        // if empty stack, return true
        // else return false
        return st.isEmpty();
    }
}
