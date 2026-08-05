class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final int windowLength = s1.length();
        final int end = s2.length() - windowLength;

        final char[] arr1 = s1.toCharArray();
        final char[] arr2 = s2.toCharArray();

        int left = 0;

        final Map<Character, Integer> s1Map = new HashMap();

        for (char c : arr1) {
            final int cur = s1Map.getOrDefault(c, 0);

            s1Map.put(c, cur + 1);
        }

        while (left <= end) {
            // Collect What is there
            final Map<Character, Integer> window = new HashMap();

            for (int i = 0; i < windowLength; i++) {
                final char c = arr2[i + left];
                window.put(c, window.getOrDefault(c, 0) + 1);
            }
            
            if (s1Map.equals(window))
                return true;
            
            left += 1;
        }

        return false;
    }
}
