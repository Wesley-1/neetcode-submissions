class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> hashed = new HashMap<>();

        for (char c : s.toCharArray()) 
            hashed.compute(c, (a, b) -> b == null ? 1 : b + 1);
        
        for (char c : t.toCharArray()) {
            if (!hashed.containsKey(c)) return false;
            hashed.compute(c, (a, b) -> {
                int newValue = b - 1;
                return newValue <= 0 ? null : newValue;
            });
        }

        return true;
    }
}
