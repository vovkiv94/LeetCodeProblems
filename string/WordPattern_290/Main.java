package WordPattern_290;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result = s.wordPattern("abba", "dog cat cat dog");
        System.out.print(result);
    }
}