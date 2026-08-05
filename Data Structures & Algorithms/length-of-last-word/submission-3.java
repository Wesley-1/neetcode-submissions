class Solution {
    public int lengthOfLastWord(String s) {
        int answer = 0;
        String [] words = s.split(" ");
        String word_i_need = words[words.length - 1];
        return word_i_need.length();
    }
}