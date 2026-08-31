class Solution {
    public int characterReplacement(String s, int k) {
       final Set<Character> chars = new HashSet();

       for (char c : s.toCharArray()) chars.add(c);

        int max = 0;
       for (char c : chars) {
        int count = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == c) {
                count++;
            }

            while ((right - left + 1) - count > k) {
                if (s.charAt(left) == c) {
                    count--;
                }

                left++;
            }
            
            max = Math.max(max, right - left + 1);
        }
       }

       return max;
    }
}
