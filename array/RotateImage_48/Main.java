package RotateImage_48;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = new int[][]{{1, 2, 3}, {3, 2, 1}, {2, 4, 5}};
        s.rotate(arr);
        System.out.print(arr);
    }
}