class Solution {
    public int appendCharacters(String s, String t) {
        int matching = 0;

        int left = 0;
        int tPtr = 0;
        while (left < s.length() && tPtr < t.length()) {
            if (s.charAt(left) == t.charAt(tPtr)) {
                matching++;
                left++;
                tPtr++;
            } else {
                left++;
            }
        }

        return t.length() - matching;
    }
}