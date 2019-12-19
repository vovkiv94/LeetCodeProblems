package ValidPerfectSquare_367;

/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * <p>
 * Note: Do not use any built-in library function such as sqrt.
 * <p>
 * Example 1:
 * <p>
 * Input: 16
 * Output: true
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1) return true;
        int start = 1;
        int end = num/2;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (num / mid == mid && num % mid == 0) return true;
            if(num/mid < mid) end = mid-1;
            else start = mid+1;
        }
        return false;
    }

    public boolean isPerfectSquare2(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}