class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        final List<List<Integer>> lst = new ArrayList();
        final Set<String> keys = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            final int first = nums[i];
            
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                final int second = nums[left];
                final int third = nums[right];

                final int sum = first + second + third;

                if (sum < 0) left++;
                else if (sum > 0) right--;
                else {
                    if (!keys.contains(first+":"+second+":"+third)) {
                        lst.add(List.of(first, second, third));
                        keys.add(first+":"+second+":"+third);
                    }
                    right--;
                    left++;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                }
            }
        }

        return lst;
    }
}
