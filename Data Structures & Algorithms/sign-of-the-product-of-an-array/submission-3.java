class Solution {
    public int arraySign(int[] nums) {
        
        long p = 1;

        for (int n : nums) {
            int s = signFunc(p * n);
            p = s;
        }

        return signFunc(p);
    }

    public int signFunc(long x) {
        if (x > 0) return 1;
        else if (x < 0) return -1;
        else return 0;
    }
}