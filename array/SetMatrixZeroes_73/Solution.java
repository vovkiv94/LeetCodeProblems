package SetMatrixZeroes_73;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example 1:
 * <p>
 * Input: [2,2,1]
 * Output: 1
 */
class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return;
        Set<Integer> ms = new HashSet<>();
        Set<Integer> ns = new HashSet<>();
        for(int i=0; i< matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    ms.add(i);
                    ns.add(j);
                }
            }
        }

        for(int m : ms)
            for(int j=0; j<matrix[0].length; j++)
                matrix[m][j] = 0;
        for(int n : ns)
            for(int i=0; i<matrix.length; i++)
                matrix[i][n] = 0;
    }
}