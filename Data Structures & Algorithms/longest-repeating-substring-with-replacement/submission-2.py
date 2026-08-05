class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left = 0
        
        maximum = 0
        counts = {}
        maximumFrequency = 0
        for right in range(len(s)):
            counts[s[right]] = 1 + counts.get(s[right], 0)
            maximumFrequency = max(maximumFrequency, counts[s[right]])

            while (right - left + 1) - maximumFrequency > k:
                counts[s[left]] -= 1
                left += 1
            maximum = max(maximum, right - left + 1)
        return maximum