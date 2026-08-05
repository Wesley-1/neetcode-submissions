class Solution {
    public int lengthOfLastWord(String s) {
        final String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}