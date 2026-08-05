class Solution {
    public boolean wordPattern(String pattern, String s) {
        final Map<Character, String> cm = new HashMap();
        final Map<String, Character> wm = new HashMap();

        String[] words = s.split(" ");

        if (words.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            final char c = pattern.charAt(i);

            if (cm.containsKey(c) && !words[i].equals(cm.get(c)) || wm.containsKey(words[i]) && c != wm.get(words[i])) { 
                return false;
            }

            cm.put(c, words[i]);
            wm.put(words[i], c);
        }

        return true;
    }
}