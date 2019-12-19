package WordSearch_79;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent"
 * cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * <p>
 * Example:
 * <p>
 * board =
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * <p>
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 */
class Solution {
    int rows;
    int columns;
    char[][] board;
    String word;

    public boolean exist(char[][] board, String word) {
        if (board.length == 0) return false;
        if (word.length() == 0) return true;
        this.board = board;
        this.word = word;
        rows = board.length;
        columns = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (helper(i, j, 0)) return true;
            }
        }
        return false;
    }

    public boolean helper(int m, int n, int index) {
        if (m < 0 || n < 0 || m > rows - 1 || n > columns - 1 || board[m][n] != word.charAt(index)) return false;
        board[m][n] = ' ';
        if (index == word.length() - 1) return true;
        boolean res = helper(m + 1, n, index + 1) ||
                helper(m, n + 1, index + 1) ||
                helper(m - 1, n, index + 1) ||
                helper(m, n - 1, index + 1);

        board[m][n] = word.charAt(index);

        return res;
    }
}