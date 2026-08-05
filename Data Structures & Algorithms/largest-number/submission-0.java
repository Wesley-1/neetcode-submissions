class Solution {
    public String largestNumber(int[] nums) {
        final String[] arr = Arrays
            .stream(nums)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        System.out.println(Arrays.toString(arr));

        final String r = String.join("", arr);

        return r.charAt(0) == '0' ? "0" : r;

    }
}