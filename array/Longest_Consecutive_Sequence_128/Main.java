package Longest_Consecutive_Sequence_128;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2147483646,-2147483647,0,2,2147483644,-2147483645,2147483645};
        int result = s.longestConsecutive(arr);
        System.out.print(result);
    }
}