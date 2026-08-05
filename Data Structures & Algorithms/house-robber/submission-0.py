class Solution:
    def rob(self, nums: List[int]) -> int:
        lastRob=secondLastRob=0

        for n in nums:
            temp = max(n + secondLastRob, lastRob)
            secondLastRob = lastRob
            lastRob = temp
            
        return lastRob