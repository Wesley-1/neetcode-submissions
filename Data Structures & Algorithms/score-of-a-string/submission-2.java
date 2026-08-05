class Solution {
    public int scoreOfString(String s) {
        int i = 0;
        int answer = 0 ;
        while(i<s.length()-1){
            answer += Math.abs(s.charAt(i+1)-s.charAt(i));
            i++;
        }
        return answer;
    }
}