class Solution {
    public int[] twoSum(int[] numbers, int target) {
        final int len = numbers.length;

        int left = 0;
        int right = len - 1;

        while (left < right) {
            final int leftValue = numbers[left];
            final int rightValue = numbers[right];

            final int sum = leftValue + rightValue;

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }

        return new int[]{};
    }
}
