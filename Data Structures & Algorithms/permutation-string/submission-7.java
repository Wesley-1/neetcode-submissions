class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final int windowLength = s1.length();
        final Map<Character, Integer> chars = new HashMap();
        final char[] arr = s1.toCharArray();
        final char[] arr2 = s2.toCharArray();

        for (char c : arr)
            chars.put(c, chars.getOrDefault(c, 0) + 1);
        
        int left = 0;

        while (left < s2.length()) {
            while (left < s2.length() && !chars.containsKey(arr2[left])) {
                left++;
            }

            final Map<Character, Integer> mp = new HashMap();
            for (int i = 0; i < windowLength && left + i < s2.length(); i++) {
                mp.put(arr2[left + i], mp.getOrDefault(arr2[left + i], 0) + 1);
            }
            
            if (mp.equals(chars)) return true;

            left++;
        }

        return false;
    }
}
