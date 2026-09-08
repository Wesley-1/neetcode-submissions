class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        final Map<String, List<String>> anagrams = new HashMap();

        for (String str : strs) {
            final int[] buckets = new int[26];

            for (char c : str.toCharArray()) {
                buckets[c - 'a']++;
            }

            final String key = Arrays.toString(buckets);
            
            final List<String> lst = anagrams.getOrDefault(
                key,
                new ArrayList()
            );

            lst.add(str);

            anagrams.put(key, lst);
        }

        return new ArrayList(anagrams.values());
    }
}
