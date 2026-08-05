class Solution {
    public List<Integer> partitionLabels(String s) {
        final Map<Character, Integer> finalIndexes = new HashMap();
        
        for (int i = 0; i < s.length(); i++)
            finalIndexes.put(s.charAt(i), i);
        
        final List<Integer> labels = new ArrayList();

        int end = 0;
        int width = 0;
        for (int i = 0; i < s.length(); i++) {
            width++;

            end = Math.max(end, finalIndexes.get(s.charAt(i)));

            if (i == end) {
                labels.add(width);
                width = 0;
            }
        }

        return labels;
    }
}
