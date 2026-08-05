class Solution {
    public int[] replaceElements(int[] arr) {
        final int n = arr.length;

        int prevMax = -1;
        for (int i = n - 1; i >= 0; i--) {
            int tmp = arr[i];
            arr[i] = prevMax;
            prevMax = Math.max(tmp, prevMax);
        }

        return arr;
    }
}