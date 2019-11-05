package Searcha2DMatrix_74;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * <p>
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * Example 1:
 * <p>
 * Input:
 * matrix = [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * target = 3
 * Output: true
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int start = 0;
        int end = matrix.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid][0] == target) return true;
            if (matrix[mid][0] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (end >= 0) {
            int row = end;
            start = 0;
            end = matrix[row].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (matrix[row][mid] == target) return true;
                if (matrix[row][mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int start = 0, rows = matrix.length, cols = matrix[0].length;
        int end = rows * cols - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (matrix[mid / cols][mid % cols] == target) {
                return true;
            }
            if (matrix[mid / cols][mid % cols] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
