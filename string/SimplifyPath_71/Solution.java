package SimplifyPath_71;

import java.util.Stack;

/**
 * Given an absolute path for a file (Unix-style), simplify it. Or in other words, convert it to the canonical path.
 * <p>
 * In a UNIX-style file system, a period . refers to the current directory.
 * Furthermore, a double period .. moves the directory up a level. For more information, see:
 * Absolute path vs relative path in Linux/Unix
 * <p>
 * Note that the returned canonical path must always begin with a slash /,
 * and there must be only a single slash / between two directory names.
 * The last directory name (if it exists) must not end with a trailing /.
 * Also, the canonical path must be the shortest string representing the absolute path.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "/home/"
 * Output: "/home"
 * Explanation: Note that there is no trailing slash after the last directory name.
 */
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        for (String cur : path.split("/")) {
            if (cur.equals("..")) {
                if (!stack.empty()) stack.pop();
            } else if (cur.length() > 0 && !cur.equals(".")) stack.push(cur);
        }
        return "/" + String.join("/", stack);
    }
}