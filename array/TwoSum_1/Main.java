package TwoSum_1;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = s.twoSum(arr, target);
        System.out.print(result[0] + ":" + result[1]);
    }
}