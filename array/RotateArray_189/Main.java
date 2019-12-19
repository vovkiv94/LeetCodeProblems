package RotateArray_189;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 1, 2, 3, 4};
        s.rotate(arr, 2);
        System.out.print(Arrays.toString(arr));
    }
}