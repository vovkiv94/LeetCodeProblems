package MaximumAverageSubarray1_643;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,12,-5,-6,50,3};
        int target = 4;
        double result = s.findMaxAverage(arr, target);
        System.out.print(result);
    }
}