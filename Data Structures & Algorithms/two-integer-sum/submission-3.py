class Solution:
    # 3, 4, 5, 6 - 7
    # 
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        size = len(nums)
        storage = {}

        for i in range(size): 
            val = nums[i]
            req = target - nums[i]
            
            if req in storage.keys():
                return [storage[req], i]
            
            storage[val] = i

        return []