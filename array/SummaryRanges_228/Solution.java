package SummaryRanges_228;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * <p>
 * Example 1:
 * <p>
 * Input:  [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 * Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
 */
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) return res;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            sb.append(cur);
            while (i < nums.length - 1 && nums[i + 1] - nums[i] == 1) i++;
            if (cur != nums[i]) {
                sb.append("->");
                sb.append(nums[i]);
            }
            res.add(sb.toString());
            sb.setLength(0);
        }
        return res;
    }
}
