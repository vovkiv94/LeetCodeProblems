package CompareVersionNumbers_165;

/**
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.
 * <p>
 * Example 1:
 * <p>
 * Input: version1 = "0.1", version2 = "1.1"
 * Output: -1
 * Example 2:
 * <p>
 * Input: version1 = "1.0.1", version2 = "1"
 * Output: 1
 */
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1a = version1.split(".");
        String[] v2a = version2.split(".");
        int i = 0;
        while (i < v1a.length && i < v2a.length) {
            if (Integer.parseInt(v1a[i]) > Integer.parseInt(v2a[i])) return 1;
            else if (Integer.parseInt(v1a[i]) < Integer.parseInt(v2a[i])) return -1;
        }
        if (v1a.length == v2a.length) return 0;
        return v1a.length > v2a.length ? 1 : -1;

    }
}