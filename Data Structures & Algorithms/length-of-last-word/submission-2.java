class Solution {
    public int lengthOfLastWord(String s) {
        int answer = 0;
        String [] words = s.split(" ");
        String word_i_need = words[words.length - 1];
        for(char a: word_i_need.toCharArray()){
            answer++;
        }
        return answer;
    }
}