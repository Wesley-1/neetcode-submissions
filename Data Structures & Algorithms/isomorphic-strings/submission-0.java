class Solution {
    public boolean isIsomorphic(String s, String t) {
        final Map<Character, Character> sm = new HashMap();
        final Map<Character, Character> tm = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            final char sc = s.charAt(i);
            final char tc = t.charAt(i);

            if (
                sm.containsKey(tc) && sc != sm.get(tc) ||
                tm.containsKey(sc) && tc != tm.get(sc)
            ) return false;

            sm.put(tc, sc);
            tm.put(sc, tc);
        }

        return true;
    }
}