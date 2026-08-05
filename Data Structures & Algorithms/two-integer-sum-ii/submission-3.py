class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = len(numbers) - 1
        
        # 1, 2, 3, 4
        # target = 3
        # 1 and 4
        # 1 + 4 = 5
        # too big. 
        # 1 + 3 = 4
        # too big. 
        # 1 + 2 = 3
        while left < right:
            lv = numbers[left]
            rv = numbers[right]
            twoSum = lv + rv

            if twoSum == target:
                return [left + 1, right + 1]
            elif twoSum > target:
                right -= 1
            else:
                left += 1
        return []