class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int res = right; 
        while (left <= right) {
            int m = (left + right) / 2;

            long timeTaken = 0;
            for (int pile : piles) {
                timeTaken += Math.ceil((double)pile / m);
            }

            if (timeTaken > h) { left = m + 1; }
            else if (timeTaken <= h) { right = m - 1; res = m;}
        }

        return res;
    }
}
