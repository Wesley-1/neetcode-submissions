class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        final int[][] newIntervals = new int[intervals.length + 1][2];

        int c = 0;
        boolean added = false;
        for (int[] interval : intervals) {
            final int start = interval[0];
            final int end = interval[1];

            if (newInterval[0] < start && !added) {
                newIntervals[c++] = newInterval;
                added = true;
            }

            newIntervals[c++] = interval;
        }

        if (!added) newIntervals[c++] = newInterval;

        System.out.println(Arrays.deepToString(newIntervals));

        return mergeIntervals(newIntervals);
    }

    public int[][] mergeIntervals(int[][] intervals) {
        final Stack<int[]> merged = new Stack();

        for (int i = 0; i < intervals.length; i++) {
            final int[] interval = intervals[i];

            if (!merged.isEmpty()) {
                final int[] peeked = merged.peek();
                if (interval[0] <= peeked[1]) {
                    merged.pop();
                    merged.push(new int[]{
                        Math.min(
                            peeked[0],
                            interval[0]
                        ),
                        Math.max(
                            peeked[1],
                            interval[1]
                        )
                    });
                } else {
                    merged.push(interval);
                }
            } else {
                merged.push(interval);
            }
        }

        final int[][] res = new int[merged.size()][2];
        int c = 0;
        for (int[] r : merged) res[c++] = r;

        return res;
    }
}
