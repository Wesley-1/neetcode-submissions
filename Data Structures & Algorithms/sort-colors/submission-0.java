class Solution {
    public void sortColors(int[] nums) {
        int[] bucket = new int[3];

        for (int n : nums) bucket[n]++;

        int pos = 0;
        for (int i = 0; i < 3; i++) {
            int count = bucket[i];

            for (int j = 0; j < count; j++)
                nums[pos++] = i;
        }
    }
}