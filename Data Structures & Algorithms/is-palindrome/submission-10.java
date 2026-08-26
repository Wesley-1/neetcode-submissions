class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            final char cL = Character.toLowerCase(s.charAt(left));
            final char rL = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetterOrDigit(cL)) {
                left++;
            } else if (!Character.isLetterOrDigit(rL)) {
                right--;
            } else {
                left++;
                right--;

                if (cL != rL) return false;
            }

            
        }

        return true;
    }
}