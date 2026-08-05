class Solution {
    public String customSortString(String order, String s) {
        final Map<Character, Integer> indexes = new HashMap();

        for (int i = 0; i < order.length(); i++) indexes.put(
            order.charAt(i), 
            Math.min(indexes.getOrDefault(order.charAt(i), i), i)
        );

        final Comparator<Character> comparator = (a, b) -> {

            return Integer.compare(indexes.getOrDefault(a, Integer.valueOf(a)), indexes.getOrDefault(b, Integer.valueOf(b)));
        };

        final Map<Character, Integer> freq = new TreeMap(comparator);

        for (char c : s.toCharArray()) freq.put(
            c,
            freq.getOrDefault(c, 0) + 1
        );

        final StringBuilder builder = new StringBuilder();

        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            final int f = e.getValue();
            final char c = e.getKey();

            for (int i = 0; i < f; i++) {
                builder.append(c);
            }
        }

        return builder.toString();
    }
}