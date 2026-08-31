class Solution {
    public int lengthOfLongestSubstring(String s) {
        final Map<Character, Integer> loc = new HashMap();

        int left = 0;
        int res = 0;
        for (int right = 0; right < s.length(); right++) {
            final char rightValue = s.charAt(right);

            if (loc.containsKey(rightValue))
                left = Math.max(loc.get(rightValue) + 1, left);
            
            loc.put(rightValue, right);
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
