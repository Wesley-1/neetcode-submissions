class Solution {
    public int heightChecker(int[] heights) {
        final int len = heights.length;
        final int[] counts = new int[101];

        for (int n : heights) counts[n]++;

        
        final List<Integer> expected = new ArrayList();
        
        for (int p = 0; p < counts.length; p++) {
            for (int i = 0; i < counts[p]; i++) {
                expected.add(p);
            }
        }
        

        int res = 0;
        for (int i = 0; i < len; i++) {
            if (heights[i] != expected.get(i)) res++;
        }

        return res;
    }
}