class Solution {
    public int lastStoneWeight(int[] stones) {
        final PriorityQueue<Integer> heaviest = new PriorityQueue();

        for (int n : stones)
            heaviest.offer(-n); // Cause we're using a min heap we need to negate. 
        
        while (heaviest.size() > 1) {
            final int x = heaviest.poll();
            final int y = heaviest.poll();

            if (x < y) heaviest.offer(x - y);
        }
        
        return heaviest.isEmpty() ? 0 : Math.abs(heaviest.peek());
    }

}
