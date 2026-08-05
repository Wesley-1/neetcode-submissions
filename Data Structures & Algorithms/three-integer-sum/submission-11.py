class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        l = len(nums)

        res = []
      
        for i in range(l):
            n1 = nums[i]
            # Because no pos + pos + pos = 0. 
            if n1 > 0:
                break

            # If the last one equals this one. We continue.
            # Cause it'd create a duplicate. 
            # if i > 0 and n1 == nums[i - 1]:
            #     continue
                
            left = i + 1
            right = l - 1

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
                    # We already used these. So we move in. 
                    left += 1
                    right -= 1

                    # We move left so we don't use duplicate L values. Cause that'd be a duplicate. 
                    # while nums[left] == nums[left - 1] and left < right:
                    #     left += 1
                else:
                    left += 1
                    right -= 1
                    

                    

        return res