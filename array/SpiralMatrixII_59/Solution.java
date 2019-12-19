package SpiralMatrixII_59;

/**
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * <p>
 * Example:
 * <p>
 * Input: 3
 * Output:
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 */
public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int iteration = 0;
        int current = 1;
        while (current <= n * n) {
            int row = iteration, column = iteration;
            while (column < n - iteration) {
                result[row][column] = current++;
                column++;
            }
            column--;
            row++;
            while (row < n - iteration) {
                result[row][column] = current++;
                row++;
            }
            row--;
            column--;
            while (column >= iteration) {
                result[row][column] = current++;
                column--;
            }
            column++;
            row--;
            while (row > iteration) {
                result[row][column] = current++;
                row--;
            }
            iteration++;
        }
        return result;
    }

    public int[][] generateMatrix2(int n) {
        // Declaration
        int[][] matrix = new int[n][n];

        // Edge Case
        if (n == 0) {
            return matrix;
        }

        // Normal Case
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        int num = 1; //change

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = num++; //change
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = num++; //change
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                if (rowStart <= rowEnd)
                    matrix[rowEnd][i] = num++; //change
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                if (colStart <= colEnd)
                    matrix[i][colStart] = num++; //change
            }
            colStart++;
        }

        return matrix;
    }
}