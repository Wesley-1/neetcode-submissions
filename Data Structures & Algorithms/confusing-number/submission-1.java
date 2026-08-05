class Solution {
    public boolean confusingNumber(int n) {
        int original = n;
        int number = 0;

        while (n != 0) {
            int digit = n % 10; // get last digit

            if (digit == 2 || digit == 3 || digit == 4 || digit == 5 || digit == 7) {
                return false;
            }
            else if (digit == 6) {
                digit = 9;
            }
            else if (digit == 9) {
                digit = 6;
            }

            number = number * 10 + digit; // build rotated number

            n = n / 10; // remove last digit
        }

        return number != original;
    }
}