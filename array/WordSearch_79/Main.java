package WordSearch_79;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] arr = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}};
        boolean result = s.exist(arr, "ABCESEEEFS");
        System.out.print(result);
    }
}