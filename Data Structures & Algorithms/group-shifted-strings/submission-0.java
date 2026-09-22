class Solution {
    String getHash(String s) {
        final char[] chars = s.toCharArray();
        final StringBuilder hashKey = new StringBuilder();

        for (int i = 1; i < chars.length; i++)
            hashKey.append((char) ((chars[i] - chars[i - 1] + 26) % 26 + 'a'));

        return hashKey.toString();
    }

    public List<List<String>> groupStrings(String[] strings) {
        final Map<String, List<String>> mapHashToList = new HashMap<>();

        for (String str : strings ) {
            final String hashKey = getHash(str);

            if (mapHashToList.get(hashKey) == null)
                mapHashToList.put(hashKey, new ArrayList<>());

            mapHashToList.get(hashKey).add(str);
        }

        final List<List<String>> groups = new ArrayList<>();
        for (List<String> group : mapHashToList.values())
            groups.add(group);

        return groups;
    }
}
