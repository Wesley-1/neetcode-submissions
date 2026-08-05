class Solution {
    public int characterReplacement(String s, int k) {
        
        final Set<Character> set = new HashSet();
        final char[] arr = s.toCharArray();

        for (char c : arr) set.add(c);

        int maximum = 0;
        for (char c : set) {
            int count = 0;
            int left = 0;
            for (int right = 0; right < s.length(); right++) {
                
                if (s.charAt(right) == c) count++;

                while ((right - left + 1) - count > k) {
                    if (s.charAt(left) == c) count--;
                    left++;
                }

                maximum = Math.max((right - left + 1), maximum);
            }
        }

        return maximum;
    }
}
