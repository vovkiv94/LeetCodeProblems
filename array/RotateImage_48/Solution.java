package RotateImage_48;

/**
 * You are given an n x n 2D matrix representing an image.
 * <p>
 * Rotate the image by 90 degrees (clockwise).
 * <p>
 * Note:
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 * <p>
 * Example 1:
 * <p>
 * Given input matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * rotate the input matrix in-place such that it becomes:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 */
class Solution {
    public void rotate(int[][] matrix) {
        int s = 0, e = matrix.length - 1;
        while (s < e) {
            int[] temp = matrix[s];
            matrix[s] = matrix[e];
            matrix[e] = temp;
            s++;
            e--;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void rotate2(int[][] matrix) {
        int n = matrix.length - 1;
        int mid = (n + 1) / 2 + (n + 1) % 2;
        for (int i = 0; i < mid; i++) {
            for (int j = i; j < n - i; j++) {
                int temp = matrix[j][n - i];
                matrix[j][n - i] = matrix[i][j];

                int temp2 = matrix[n - i][n - j];
                matrix[n - i][n - j] = temp;

                temp = matrix[n - j][i];
                matrix[n - j][i] = temp2;

                matrix[i][j] = temp;
            }
        }
    }
}