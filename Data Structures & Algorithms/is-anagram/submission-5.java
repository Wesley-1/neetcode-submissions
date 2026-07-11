class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        final Map<Character, Integer> countsT = new HashMap();
        final Map<Character, Integer> countsS = new HashMap();

        final char[] sArr = s.toCharArray();
        final char[] tArr = t.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            final char sC = sArr[i];
            final char tC = tArr[i];

            countsS.put(sC, countsS.getOrDefault(sC, 0) + 1);
            countsT.put(tC, countsT.getOrDefault(tC, 0) + 1);
        }

        return countsS.equals(countsT);
    }
}
