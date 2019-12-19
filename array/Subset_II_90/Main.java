package Subset_II_90;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 2, 1, 3};
        List<List<Integer>> result = s.subsetsWithDup(arr);
        System.out.print(result);
    }
}