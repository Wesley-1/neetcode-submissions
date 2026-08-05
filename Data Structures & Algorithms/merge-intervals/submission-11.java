class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        final Stack<int[]> stack = new Stack();
        
        for (int i = 0; i < intervals.length; i++) {
            final int start = intervals[i][0];
            final int end = intervals[i][1];
            
            if (!stack.isEmpty()) {
                final int[] prev = stack.peek();
                final int prevEnd = prev[1];
                final int prevStart = prev[0];

                if (start <= prevEnd) {
                    stack.pop();
                    stack.push(new int[]{
                        Math.min(start, prevStart),
                        Math.max(end, prevEnd)
                    });
                } else {
                    stack.push(new int[]{
                        start,
                        end
                    });
                }
            } else {
                stack.push(new int[]{
                    start,
                    end
                });
            }
        }

        final int[][] a = new int[stack.size()][2];
        int c = 0;
        for (int[] arr : stack) a[c++] = arr;

        return a;
    }
}
