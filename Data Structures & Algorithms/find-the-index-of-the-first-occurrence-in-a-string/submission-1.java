class Solution {
    public int strStr(String haystack, String needle) {
        int left = 0;
        
        while (left + needle.length() - 1 < haystack.length()) {
            int right = 0;
            
            boolean found = true;
            while (right < needle.length()) {
                if (haystack.charAt(left + right) == needle.charAt(right))
                    right++;
                else {
                    found = false;
                    break;
                }
            }

            if (found) {
                return left;
            }

            left++;
        }

        return -1;
    }
}