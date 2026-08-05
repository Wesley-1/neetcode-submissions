class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        final Integer[] arr = new Integer[names.length];
        
        for (int i = 0; i < names.length; i++) {
            arr[i] = i;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(heights[b], heights[a]));

        String[] a = new String[arr.length];

        int added = 0;
        for (int i : arr) {
            a[added++] = names[i];
        }

        return a;
    }
}