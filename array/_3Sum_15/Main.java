package _3Sum_15;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = s.threeSum(arr);
        for (List<Integer> el : result) {
            System.out.println(el.stream().map(i -> i.toString()).collect(Collectors.joining(" : ")));
        }
    }
}