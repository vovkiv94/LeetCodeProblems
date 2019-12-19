package PowerOfFour_342;

/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * <p>
 * Example 1:
 * <p>
 * Input: 16
 * Output: true
 */
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while ((n & 1) != 1) {
            n >>>= 1;
            if ((n & 1) == 1) return false;
            n >>>= 1;
        }
        return (n >>= 1) == 0;
    }

    public boolean isPowerOfFour2(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
    }
}
