package MergeSortedArray_88;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int[] result = s.merge(arr1, 3, arr2, 3);
        for(int i = 0; i < 6; i++) {
            System.out.print(result[i] + ":");
        }
    }
}