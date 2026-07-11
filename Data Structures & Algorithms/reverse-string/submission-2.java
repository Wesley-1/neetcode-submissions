class Solution {
    public void reverseString(char[] s) {
        recursiveReverse(s, 0, s.length - 1);
    }

    public void recursiveReverse(char[] s, int left, int right) {
        if (left >= right) return;
        
        final char stored = s[left];
        
        s[left] = s[right];
        s[right] = stored;

        recursiveReverse(s, left + 1, right - 1);
    }
}