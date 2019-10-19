package Merge_Sorted_Array_88;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * <p>
 * Example:
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 */
class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        for (int i = m + n - 1; i >= 0; i--) {
            if (n <= 0) {
                res[i] = nums1[--m];
            } else if (m <= 0) {
                res[i] = nums2[--n];
            } else if (nums1[m - 1] > nums2[n - 1]) {
                res[i] = nums1[--m];
            } else {
                res[i] = nums2[--n];
            }
        }
        return res;
    }
}