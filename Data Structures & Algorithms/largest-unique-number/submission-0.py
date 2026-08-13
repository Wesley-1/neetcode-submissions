class Solution:
    def largestUniqueNumber(self, nums: List[int]) -> int:
        s = set()
        tracked = set()

        for n in nums:
            if n in s:
                s.remove(n)
                tracked.add(n)

            if n not in tracked:
                s.add(n)
        
        return max(s or [-1])