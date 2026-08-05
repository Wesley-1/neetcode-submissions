class Solution:
    def encode(self, strs: List[str]) -> str:
        # 5#...
        return "".join([str(len(s)) + "#" + s for s in strs])
    
    def decode(self, s: str) -> List[str]:
        # Split on the num. 
        decoded = []

        i = 0
        # 5#hello5#world
        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1
            
            length = int(s[i:j])
            
            i = j + 1
            j += length + 1

            parsed = s[i:j]
            print(i)
            print(j)
            decoded.append(parsed)

            i = j
            

        return decoded