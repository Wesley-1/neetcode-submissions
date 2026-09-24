class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 0; //points to the first element
        int ptr1 = 1; //points to the second element
        while(ptr1 < nums.length){
            if(nums[ptr] != nums[ptr1]){
                ptr++;
                nums[ptr] = nums[ptr1];
            }
            ptr1++;
        }
        return ptr + 1;
    }
}