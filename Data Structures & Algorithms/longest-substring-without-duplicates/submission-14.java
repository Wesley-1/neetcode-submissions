class Solution {
    public int lengthOfLongestSubstring(String s) {
        final Map<Character, Integer> chars = new HashMap();

        int res = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);

            if (chars.containsKey(c))
                left = Math.max(left, chars.get(c) + 1);
                
            chars.put(c, i);
            res = Math.max(res, i - left + 1);
        }

        return res;
    }
}
