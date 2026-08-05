class Solution {
    public int[] productExceptSelf(int[] nums) {
        final int len = nums.length;
        final int[] output = new int[len];

        output[0] = 1;
        for (int i = 1; i < len; i++) {
            output[i] = output[i - 1] * nums[i - 1];
            System.out.println(output[i]);
        }   

        int suffix = 1;
        for (int i = len - 1; i >= 0; i--) {
            output[i] *= suffix;
            suffix *= nums[i];
        }

        return output;
    }
}  
