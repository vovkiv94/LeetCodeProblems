package Next_Permutation_31;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {5, 1, 1};
        s.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}