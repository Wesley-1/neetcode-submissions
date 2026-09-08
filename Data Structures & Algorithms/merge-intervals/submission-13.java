class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        final Stack<int[]> stack = new Stack();

        for (int[] interval : intervals) {
            if (!stack.isEmpty() && stack.peek()[1] >= interval[0]) {
                final int[] cur = stack.pop();
                stack.push(new int[]{
                    Math.min(cur[0], interval[0]),
                    Math.max(cur[1], interval[1])
                });
            } else {
                stack.push(interval);
            }
        }
        
        final int size = stack.size();
        final int[][] res = new int[size][2];

        for (int i = 0; i < size; i++)
            res[i] = stack.pop();

        return res;
    }
}
