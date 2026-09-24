class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1; //full till here; rest are 0s 
        int ptr2 = n-1; //size of second array
        int ptr = (m+n)-1; //size of first Array

        while(ptr2>=0){
            if (ptr1 >= 0 && nums1[ptr1] > nums2[ptr2]) {
                nums1[ptr]= nums1[ptr1]; 
                ptr--;
                ptr1--;
            }else{
                nums1[ptr]=nums2[ptr2];
                ptr2--;
                ptr--;
            }

        }

        
    }
}