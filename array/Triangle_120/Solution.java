package Triangle_120;

import java.util.List;

/**
 * Given a triangle, find the minimum path sum from top to bottom.
 * Each step you may move to adjacent numbers on the row below.
 * <p>
 * For example, given the following triangle
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 */
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> res = triangle.get(triangle.size() - 1);
        for(int i = triangle.size() - 2; i>=0; i--) {
            for(int j = 0; j < triangle.get(i).size(); j++) {
                res.set(j, Math.min(res.get(j), res.get(j+1)) + triangle.get(i).get(j));
            }
        }
        return res.get(0);
    }
}