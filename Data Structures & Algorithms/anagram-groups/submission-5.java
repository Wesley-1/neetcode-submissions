class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        final Map<String, List<String>> anagrams = new HashMap();

        for (String str : strs) {
            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            final String key = Arrays.toString(arr);

            anagrams.putIfAbsent(
                key,
                new ArrayList()
            );

            anagrams.get(key).add(str);
            
        }

        return new ArrayList(anagrams.values());
    }
}
