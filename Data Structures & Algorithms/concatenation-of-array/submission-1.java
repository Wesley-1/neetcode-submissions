class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] solutions = new int[2*nums.length];
        for(int i = 0; i<nums.length;i++){
            solutions[i]=nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            solutions[i+nums.length]= nums[i];
        }
        return solutions;
    }
}