package Pascal_Triangle_118;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * Example:
 * <p>
 * Input: 5
 * Output:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows > 0) {
            List firstRow = new ArrayList<>();
            firstRow.add(1);
            res.add(firstRow);

            for (int i = 1; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();

                row.add(1);
                for (int j = 1; j < i; j++) {
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
                row.add(1);

                res.add(row);
            }

        }
        return res;
    }
}