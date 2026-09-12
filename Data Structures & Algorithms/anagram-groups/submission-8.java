class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        final Map<String, List<String>> anagrams = new HashMap();
        
        for (String str : strs) {
            final int[] arr = new int[26];

            for (char c : str.toCharArray()) {
                arr[c - 'a']++;
            }

            final String key = Arrays.toString(arr);

            final List<String> group = anagrams.getOrDefault(key, new ArrayList());

            group.add(str);

            anagrams.put(key, group);
        }

        return new ArrayList(anagrams.values());
    }
}
