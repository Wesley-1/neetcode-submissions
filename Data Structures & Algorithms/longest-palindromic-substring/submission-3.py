class Solution:
    def longestPalindrome(self, s: str) -> str: 
        resStartIndex = 0
        resLen = 0

        for i in range(len(s)):
            resStartIndex, resLen = self.process(i, i, s, resLen, resStartIndex)
            resStartIndex, resLen = self.process(i, i + 1, s, resLen, resStartIndex)

        return s[resStartIndex:resLen + resStartIndex]

    def process(self, l, r, s, resLen, resStartIndex) -> str:
        while l >= 0 and r < len(s) and s[l] == s[r]:
            windowLength = (r - l + 1)

            if windowLength >= resLen:
                resStartIndex = l
                resLen = windowLength

            l -= 1
            r += 1

        return resStartIndex, resLen

