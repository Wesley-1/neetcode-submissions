class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        final Set<List<Integer>> res = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            
            int left = i + 1;
            int right = nums.length - 1;

            int first = nums[i];

            while (left < right) {
                int second = nums[left];
                int third = nums[right];

                int sum = first + second + third;

                if (sum < 0) left++;
                else if (sum > 0) right--;
                else {

                    right--;
                    left++;
                    
                    res.add(List.of(first, second, third));
                }
            }
        }

        List<List<Integer>> lst = new ArrayList();
        lst.addAll(res);
        return lst;
    }
}
