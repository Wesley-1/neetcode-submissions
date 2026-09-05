class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int positionPtr = m + n - 1;
        
        int firstPtr = m - 1;
        int secondPtr = n - 1;

        while (secondPtr >= 0) {
            if (firstPtr >= 0 && nums1[firstPtr] > nums2[secondPtr]) 
                nums1[positionPtr--] = nums1[firstPtr--];
            else
                nums1[positionPtr--] = nums2[secondPtr--];
        }

    }
}