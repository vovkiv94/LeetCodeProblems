package Happy_Number_202;

/**
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Example:
 * <p>
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
class Solution {
    private int digitalSum(int n) {
        int sum = 0, temp;
        while (n != 0) {
            temp = n % 10;
            n /= 10;
            sum += temp * temp;
        }
        return sum;
    }

    public boolean isHappyCyclic(int n) {
        int slow = n, fast = n;
        do {
            slow = digitalSum(slow);
            fast = digitalSum(fast);
            fast = digitalSum(fast);
            if (fast == 1) return true;
        } while (slow != fast);
        return false;
    }

    public boolean isHappy(int n) {
        while (true) {
            if (n == 1 || n == 7) return true;
            else if (n < 10) return false;
            n = digitalSum(n);
        }
    }
}