package Intersection_of_Two_Arrays_II_350;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] result = s.intersect(arr1, arr2);
        System.out.print(Arrays.toString(result));
    }
}