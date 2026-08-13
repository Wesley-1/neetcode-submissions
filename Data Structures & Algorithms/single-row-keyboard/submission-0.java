class Solution {
    public int calculateTime(String keyboard, String word) {
        final char[] arr = word.toCharArray();
        final char[] kb = keyboard.toCharArray();

        final Map<Character, Integer> charIndexes = new HashMap();

        for (int i = 0; i < kb.length; i++) charIndexes.put(kb[i], i);

        int steps = 0;
        int pos = 0;
        int count = 0;
        while (count < arr.length) {
            final char c = word.charAt(count);
            final int offset = Math.abs(charIndexes.get(c) - pos);

            pos = charIndexes.get(c);
            steps += offset;

            count++;
        }

        return steps;
    }
}
