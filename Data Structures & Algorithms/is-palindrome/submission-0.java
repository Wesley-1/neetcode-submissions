class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        final String replaced = s.replaceAll("[^\\w ]", "").replaceAll(" ", "");
        char[] chars = replaced.toCharArray();
        int right = replaced.length() - 1;

        while (left < right) {
            if (Character.toUpperCase(chars[left]) != Character.toUpperCase(chars[right])) {
                System.out.println(left + " : " + right);
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
