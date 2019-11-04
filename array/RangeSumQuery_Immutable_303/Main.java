package RangeSumQuery_Immutable_303;

public class Main {
    public static void main(String[] args) {
        NumArray s = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        int result = s.sumRange(0, 3);
        System.out.print(result);
    }
}