package Subsets_78;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = s.subsets(arr);
        System.out.print(result);
    }
}