class Solution {
    public int[] getConcatenation(int[] nums) {
        final int n = nums.length;
        final int[] nums2 = new int[n * 2];

        for (int i = 0; i < n * 2; i++) {
            final int index = i % n;
            nums2[i] = nums[index];
        }

        return nums2;
    }
}