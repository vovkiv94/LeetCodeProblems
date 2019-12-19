package NumberOfIslands_200;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] arr = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        int res = s.numIslands(arr);
        System.out.println(res);
    }
}