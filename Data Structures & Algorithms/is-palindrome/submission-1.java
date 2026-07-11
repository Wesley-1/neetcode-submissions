class Solution {
    public boolean isPalindrome(String s) {
        final char[] cArr = s.toCharArray();
        final StringBuilder builder = new StringBuilder();

        for (char c : cArr) {
            if (Character.isLetterOrDigit(c)) 
                builder.append(Character.toLowerCase(c));
        }

        return builder.toString().equals(builder.reverse().toString());
    }
}
