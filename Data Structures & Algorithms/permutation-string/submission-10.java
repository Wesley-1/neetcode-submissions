class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final Map<Character, Integer> counts = new HashMap();

        for (char c : s1.toCharArray()) counts.put(
            c,
            counts.getOrDefault(c, 0) + 1
        );

        final Map<Character, Integer> cache = new HashMap();
        
        int left = 0;
        int right = 0;

        while (right < s2.length()) {
            final char c = s2.charAt(right);

            if (counts.containsKey(c)) {
                while (cache.getOrDefault(c, 0) >= counts.get(c)) {
                    cache.put(s2.charAt(left), cache.get(s2.charAt(left)) - 1);
                    left++;
                }
                
                cache.put(c, cache.getOrDefault(c, 0) + 1);
            } else {
                cache.clear();
                left = right + 1;
            }

            if (cache.equals(counts))
                return true;

            right++;
        }

        return cache.equals(counts);
    }
}
