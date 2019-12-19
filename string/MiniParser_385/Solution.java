package MiniParser_385;

import java.util.ArrayList;
import java.util.List;
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
    public NestedInteger deserialize(String s) {
        NestedInteger head = new NestedInteger();
        NestedInteger current = head;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']' || s.charAt(i) == ',') continue;
            if (s.charAt(i) == '[') {
                NestedInteger temp = new NestedInteger();
                current.add(temp);
                current = temp;
                continue;
            }

            int num = 0;
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= 9) {
                num *= 10;
                num += s.charAt(i++) - '0';
            }
            current.setInteger(num);
        }
        return head;
    }
}


// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
class NestedInteger {
    Integer val;
    List<NestedInteger> l = new ArrayList<>();

    // Constructor initializes an empty nested list.
    public NestedInteger() {
    }

    // Constructor initializes a single integer.
    public NestedInteger(int value) {
        val = value;
    }

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger() {
        return val == null;
    }

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger() {
        return val;
    }

    // Set this NestedInteger to hold a single integer.
    public void setInteger(int value) {
        val = value;
    }

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    public void add(NestedInteger ni) {
        l.add(ni);
    }

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList() {
        return l;
    }
}

