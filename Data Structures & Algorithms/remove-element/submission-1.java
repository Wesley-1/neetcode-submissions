class Solution {
    public int removeElement(int[] nums, int val) {        
        int i = 0;
        int len = nums.length;
        while (i < len) {
            final int v = nums[i];

            if (v == val) nums[i] = nums[--len];
            else i++;
        }

        return len;
    }
}