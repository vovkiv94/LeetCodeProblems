package CombinationSum_39;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> result = s.combinationSum(new int[]{1, 2, 3, 4}, 7);
        System.out.print(result);
    }
}