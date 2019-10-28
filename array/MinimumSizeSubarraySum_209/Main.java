package MinimumSizeSubarraySum_209;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        int result = s.minSubArrayLen(target, arr);
        System.out.print(result);
    }
}