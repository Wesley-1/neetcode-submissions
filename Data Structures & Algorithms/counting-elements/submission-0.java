class Solution {
    public int countElements(int[] arr) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int a: arr){
            set.add(a);
        }
        for(int a: arr){
            if(set.contains(a+1)){
                answer++;
            }
        }
        return answer;
    }
}
