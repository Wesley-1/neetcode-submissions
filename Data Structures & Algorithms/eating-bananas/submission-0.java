class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int left = 0;
        int right = max;
        int res = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            
            int totalTime = 0;
            for (int pile : piles) 
                totalTime += Math.ceil((double) pile / mid);

            if (totalTime <= h) {
                right = mid - 1;
                res = mid;
            } else {
                left = mid + 1;
            }
            
        }

        return res;
    }
}
