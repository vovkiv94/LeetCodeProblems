package UniquePath_62;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach
 * the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * How many possible unique paths are there?
 */
class Solution {
    public int uniquePaths(int m, int n) {
        double value = 1;
        m--;
        for (int i = 1; i <= n - 1; i++) {
            value *= ((double) (m + i) / (double) i);
        }
        return (int) Math.round(value);
    }
}