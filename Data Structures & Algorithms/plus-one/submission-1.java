class Solution {
    public int[] plusOne(int[] digits) {
        final StringBuilder b = new StringBuilder();

        for (int i : digits) 
            b.append(i);

        long i = Long.valueOf(b.toString());

        i++;

        final String s = String.valueOf(i);

        final int[] arr = new int[s.length()];
        for (int ib = 0; ib < s.length(); ib++) {
            arr[ib] = Integer.valueOf(s.charAt(ib) - '0');
        }

        return arr;
    }
}
