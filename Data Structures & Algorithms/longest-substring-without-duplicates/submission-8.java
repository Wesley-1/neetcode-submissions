class Solution {
    public int lengthOfLongestSubstring(String s) {
        final Deque<Character> deque = new ArrayDeque();
        int m = 0;

        for (char c : s.toCharArray()) {
            while (deque.contains(c)) 
                deque.removeFirst();

            deque.offer(c);
            m = Math.max(m, deque.size());
        }

        return m;
    }
}
