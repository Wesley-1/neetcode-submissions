class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> set = new HashMap<>();

        for(int i : nums){
            if(set.containsKey(i)){
                set.put(i, set.get(i) + 1);
            } else {
                set.put(i, 1); 
            }
            
            
            if(set.get(i) > nums.length / 2){
                return i;
            }
        }
        return -1;
    }
}