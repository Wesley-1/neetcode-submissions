class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): 
            return False
        
        sDict = {}
        tDict = {}

        for s, t in zip(s, t):
            sDict[s] = 1 + sDict.get(s, 0)
            tDict[t] = 1 + tDict.get(t, 0)
        
        return sDict == tDict