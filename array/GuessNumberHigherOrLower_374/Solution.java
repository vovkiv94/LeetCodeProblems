package GuessNumberHigherOrLower_374;

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 * <p>
 * Example:
 * <p>
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note:
 * <p>
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class Solution extends GuessGame {
    Solution(int n) {
        super(n);
    }
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);
            if (res == 0) return mid;
            if (res < 0) end = mid - 1;
            else start = mid + 1;
        }
        return 0;
    }
}

class GuessGame {
    int n;

    protected GuessGame() {
    }

    GuessGame(int n) {
        this.n = n;
    }

    int guess(int m) {
        return Integer.compare(n, m);
    }
}