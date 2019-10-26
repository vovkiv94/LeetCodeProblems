package Find_First_and_Last_Position_of_Element_in_Sorted_Array_34;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0,1,2,3,4,4,4};
        int[] result = s.searchRange(arr, 2);
        System.out.print(Arrays.toString(result));
    }
}