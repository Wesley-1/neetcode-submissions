class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) { 
        int prev = 0;       
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed.length == i + 1) {
                if (prev == 0 && flowerbed[i] == 0) n--;
                continue;
            }
            if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && prev == 0) {
                flowerbed[i] = 1;
                n--;
            }
            prev = flowerbed[i];
        }

        return n <= 0;
    }
}