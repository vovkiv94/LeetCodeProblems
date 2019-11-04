package UniquePathsII_63;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach
 * the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * Example 1:
 * <p>
 * Input:
 * [
 * [0,0,0],
 * [0,1,0],
 * [0,0,0]
 * ]
 * Output: 2
 * Explanation:
 * There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right
 */
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int columns = obstacleGrid.length;
        int rows = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1) return 0;
        obstacleGrid[0][0] = 1;

        for (int i = 1; i < columns; i++) {
            obstacleGrid[0][i] = obstacleGrid[0][i] == 0 ? obstacleGrid[0][i - 1] : 0;
        }
        for (int i = 1; i < rows; i++) {
            obstacleGrid[i][0] = obstacleGrid[i][0] == 0 ? obstacleGrid[i - 1][0] : 0;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                obstacleGrid[i][j] = obstacleGrid[i][j] == 0 ? obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1] : 0;
            }
        }
        return obstacleGrid[rows - 1][columns - 1];
    }

    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int j = 0; j < width; j++) {
                if (row[j] == 1)
                    dp[j] = 0;
                else if (j > 0)
                    dp[j] += dp[j - 1];
            }
        }
        return dp[width - 1];
    }
}