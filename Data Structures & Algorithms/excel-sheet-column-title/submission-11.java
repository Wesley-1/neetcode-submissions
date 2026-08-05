class Solution {
    public String convertToTitle(int columnNumber) {
        String answer = "";
        while(columnNumber>0){
            columnNumber--;
            int remainder = columnNumber%26;
            answer = (char)('A'+remainder)+answer;
            columnNumber=columnNumber/26;
        }
        return answer;
    }
}