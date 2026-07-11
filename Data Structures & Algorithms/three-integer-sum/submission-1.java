class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        final List<List<Integer>> numList = new ArrayList<>();
        
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            final int a = nums[i];
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                final List<Integer> numbers = new ArrayList<>();
                int lft = nums[left];
                int rht = nums[right];

                final int sum = lft + rht + a;

                if (sum < 0) left++;
                else if (sum > 0) right--;
                else {
                    numbers.add(a);
                    numbers.add(lft);
                    numbers.add(rht);
                    numList.add(numbers);
                    
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        
        return numList;
    }
}
