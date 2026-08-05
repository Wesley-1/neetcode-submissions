class Solution:
    def climbStairs(self, n: int) -> int:
        last = 1
        secondLast = 1

        for i in range(n - 1):
            temp = last
            last += secondLast
            secondLast = temp
        return last
        
