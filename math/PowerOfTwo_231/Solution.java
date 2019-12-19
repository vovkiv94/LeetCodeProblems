package PowerOfTwo_231;

/**
 * Given an integer, write a function to determine if it is a power of two.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: true
 * Explanation: 2^0 = 1
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while ((n & 1) != 1) n >>= 1;
        return (n >>= 1) == 0;
    }

    public boolean isPowerOfTwo2(int n) {
        if (n <= 0) return false;
        return (n & n - 1) == 0;
    }
}