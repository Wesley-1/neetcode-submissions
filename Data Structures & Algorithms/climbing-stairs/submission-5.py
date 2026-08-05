class Solution:
    def climbStairs(self, n: int) -> int:
        last=secondLast=1

        for i in range(n - 1):
            temp = last
            last += secondLast
            secondLast = temp

        return last
        
