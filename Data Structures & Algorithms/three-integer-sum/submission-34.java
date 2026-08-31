class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        final Set<List<Integer>> res = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                final int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    List<Integer> l = List.of(nums[i], nums[left], nums[right]);
                    
                    if (!res.contains(l)) {
                        res.add(l);
                    }

                    left++;
                    right--;
                    while (left < nums.length && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        
        return res.stream().collect(Collectors.toList());
    }
}
