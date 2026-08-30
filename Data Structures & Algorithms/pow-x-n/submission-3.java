class Solution {
    public double myPow(double x, int n) {
        if (x == 0) return 0;

        if (n == 0) return 1;

        double res = computePow(x, Math.abs(n));

        return n >= 0 ? res : 1 / res;
    }

    public double computePow(double x, int n) {
        if (n == 0) return 1;
        
        final double half = computePow(x, n / 2);

        return n % 2 == 0 ? half * half : x * half * half;
    }
}
