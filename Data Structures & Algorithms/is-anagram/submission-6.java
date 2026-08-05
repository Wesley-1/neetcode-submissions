class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        final Map<Character, Integer> sCache = new HashMap();
        final Map<Character, Integer> tCache = new HashMap();
        
        for (char c : s.toCharArray()) {
            final Integer cur = sCache.get(c);
            sCache.put(c, (cur == null ? 0 : cur) + 1);
        }
        
        for (char c : t.toCharArray()) {
            final Integer cur = tCache.get(c);
            tCache.put(c, (cur == null ? 0 : cur) + 1);
        }
        
        return tCache.equals(sCache);
    }
}
