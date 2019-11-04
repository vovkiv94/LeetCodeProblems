package FirstBadVersion_278;

/**
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 */
public class Solution {
    int badVersion;

    public Solution(int badVersion) {
        this.badVersion = badVersion;
    }

    private boolean isBadVersion(int version) {
        return version <= badVersion;
    }

    public int firstBadVersion(int n) {
        int start = 1, end = n;

        while (end != start) {
            int i = start + (end - start) / 2;
            if (isBadVersion(i)) end = i;
            else start = i + 1;
        }

        return start;
    }
}