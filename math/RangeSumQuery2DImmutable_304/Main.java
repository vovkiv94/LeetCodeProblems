package RangeSumQuery2DImmutable_304;

public class Main {
    public static void main(String[] args) {
        NumMatrix s = new NumMatrix(new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}});
        int result = s.sumRegion(2, 1, 3, 4);
        System.out.print(result);
    }
}