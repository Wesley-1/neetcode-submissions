class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // We want to merge from the end of nums1 (where it's stuff is)
        // So we want a ptr starting at nums1 end of content.
        // We then want a ptr at the end of the list. 
        // Also a ptr to the end of nums2. 

        int slotPtr = m + n - 1;
        int firstPtr = m - 1;
        int secondPtr = n - 1;

        // If this is > 0 all isnt merged.
        while (secondPtr >= 0) {
            if (firstPtr >= 0 && nums1[firstPtr] > nums2[secondPtr])
                nums1[slotPtr--] = nums1[firstPtr--];
            else
                nums1[slotPtr--] = nums2[secondPtr--];
        }
    }
}