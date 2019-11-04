package RectangleArea_223;

/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * <p>
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 * Example:
 * <p>
 * Input: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2
 * Output: 45
 */
class Solution {
    public int computeAreaMy(int A, int B, int C, int D, int E, int F, int G, int H) {
        int first = (C - A) * (D - B);
        int second = (G - E) * (H - F);

        int left = Math.max(A, E);
        int bottom = Math.max(B, F);
        int right = Math.min(C, G);
        int top = Math.min(D, H);

        if (left > right || bottom > top) {
            return first + second;
        } else {
            return first + second - (right - left) * (top - bottom);
        }

    }

    int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E), right = Math.max(Math.min(C, G), left);
        int bottom = Math.max(B, F), top = Math.max(Math.min(D, H), bottom);
        return (C - A) * (D - B) - (right - left) * (top - bottom) + (G - E) * (H - F);
    }
}