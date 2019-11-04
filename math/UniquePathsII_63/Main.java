package UniquePathsII_63;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.uniquePathsWithObstacles2(new int[][]{new int[]{0, 0, 0}, new int[]{0, 1, 0}, new int[]{0, 0, 0}});
        System.out.print(result);
    }
}