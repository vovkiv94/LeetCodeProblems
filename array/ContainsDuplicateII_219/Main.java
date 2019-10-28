package ContainsDuplicateII_219;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1, 2, 3, 1};
        boolean result = s.containsNearbyDuplicate(arr, 3);
        System.out.print(result);
    }
}