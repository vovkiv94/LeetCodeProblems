package ProductOfArrayExceptSelf_238;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {9, 2, 4, 8};
        int[] result = s.productExceptSelf(arr);
        System.out.print(Arrays.toString(result));
    }
}