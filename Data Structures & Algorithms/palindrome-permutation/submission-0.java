class Solution {
    public boolean canPermutePalindrome(String s) {
        final Set<Character> c = new HashSet();

        for (int i = 0; i < s.length(); i++) {
            if (!c.add(s.charAt(i)))
                c.remove(s.charAt(i));
        }

        return c.size() <= 1;
    }
}
