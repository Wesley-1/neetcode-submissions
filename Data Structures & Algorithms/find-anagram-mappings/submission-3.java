class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],i);
        }
        for(int i=0;i< nums1.length;i++){
            if(hm.containsKey(nums1[i])){
                answer[i]= hm.get(nums1[i]);
            }
        }
        return answer;
    }
}
