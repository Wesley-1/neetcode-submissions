class Solution {
    public boolean isPalindrome(int x) {
        final StringBuilder b = new StringBuilder();
        
        b.append(x);

        return b.toString().equals(b.reverse().toString());
    }
}