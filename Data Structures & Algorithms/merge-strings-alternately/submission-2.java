class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0;
        int right = 0;

        boolean alt = true;
        StringBuilder b = new StringBuilder();

        while (left < word1.length() && right < word2.length()) {
            if (alt) {
                b.append(word1.charAt(left++));
            } else {
                b.append(word2.charAt(right++));
            }
            alt = !alt;
        }

        while (left < word1.length()) b.append(word1.charAt(left++));
        while (right < word2.length()) b.append(word2.charAt(right++));

        return b.toString();
    }
}