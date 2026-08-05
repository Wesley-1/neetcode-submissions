class Solution {
    public int lengthOfLongestSubstring(String s) {
        final Deque<Character> characters = new ArrayDeque();

        final char[] cArr = s.toCharArray();

        int maxSize = 0;


        for (int i = 0; i < cArr.length; i++) {
            while (characters.contains(cArr[i])) {
                characters.removeFirst();
            }

            characters.offer(cArr[i]);
            maxSize = Math.max(maxSize, characters.size());
        }

        return maxSize;
    }
}
