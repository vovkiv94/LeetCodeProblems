package GroupAnagrams_49;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = s.groupAnagrams(arr);
        System.out.print(result);
    }
}