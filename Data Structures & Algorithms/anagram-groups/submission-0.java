class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Character>, List<String>> hashed = new HashMap<>();
        for (String str : strs) {
            List<Character> lst = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

            Collections.sort(lst);

            hashed.compute(lst, (a, b) -> {
                if (b == null) b = new ArrayList<>();
                b.add(str);
                return b;
            });
        }

        return new ArrayList(hashed.values());
    }
}
