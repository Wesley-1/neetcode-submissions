class Solution {
    public int arraySign(int[] nums) {
        
        int p = 1;

        for (int n : nums) {
            int s = signFunc(p * n);
            p = s;
        }

        return p;
    }

    public int signFunc(int x) {
        if (x > 0) return 1;
        else if (x < 0) return -1;
        else return 0;
    }
}