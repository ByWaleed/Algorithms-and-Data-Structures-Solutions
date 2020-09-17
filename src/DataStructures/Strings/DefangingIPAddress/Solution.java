package DataStructures.Strings.DefangingIPAddress;

class Solution {
    public String defangIPaddr(String address) {
        // First attempt:
        // return address.replace(".", "[.]");

        // Second attempt:
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c=address.charAt(i);
            if (c == '.') sb.append("[.]");
            else sb.append(c);
        }
        return sb.toString();
    }
}