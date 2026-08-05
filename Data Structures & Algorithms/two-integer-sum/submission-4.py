class Solution:
    # 3, 4, 5, 6 - 7
    # 
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        storage = {}

        for i, n in enumerate(nums):
            diff = target - n
            if diff in storage:
                return [storage[diff], i]
            storage[n] = i

        return []