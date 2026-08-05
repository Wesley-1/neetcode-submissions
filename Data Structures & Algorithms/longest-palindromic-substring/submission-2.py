class Solution:
    def longestPalindrome(self, s: str) -> str: 
        
        palindrome = ""

        for i in range(len(s)):
            palindrome = self.process(i, i, s, palindrome)
            palindrome = self.process(i, i + 1, s, palindrome)

        return palindrome

    def process(self, l, r, s, palindrome) -> str:
        while l >= 0 and r < len(s) and s[l] == s[r]:
            windowLength = (r - l + 1)

            if windowLength >= len(palindrome):
                palindrome = s[l:r+1]

            l -= 1
            r += 1

        return palindrome

