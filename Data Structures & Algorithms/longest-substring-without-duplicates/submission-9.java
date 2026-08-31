class Solution {
    public int lengthOfLongestSubstring(String s) {
        final Set<Character> charSet = new HashSet<>();

        int left = 0;
        int res = 0;
        
        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            res = Math.max(res, charSet.size());
        }

        return res;
    }
}
