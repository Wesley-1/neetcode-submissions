class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        l = len(nums)

        res = []
      
        for i in range(l):
            left = i + 1
            right = l - 1

            n1 = nums[i]
            s = None
            while left < right:
                s = n1 + nums[left] + nums[right]
                lst = [n1, nums[left], nums[right]]
                if s > 0:
                    right -= 1
                elif s < 0:
                    left += 1
                elif lst not in res:
                    res.append(lst)
                    left += 1
                    right -= 1

                    while nums[left] == nums[left - 1] and left < right:
                        left += 1
                else:
                    break
                    

                    

        return res