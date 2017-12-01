package Array;

/**
 * @Author OovEver
 * @Date 2017/12/1 18:25
 */
public class LeetCode42 {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left <= right) {
            int minH = Math.min(height[left], height[right]);
            if (height[left] == minH) {
                while (++left <= right && height[left] < minH) {
                    res += minH - height[left];
                }
            } else {
                while (--right >= left && height[right] < minH) {
                    res += minH - height[right];
                }
            }
        }
        return res;
    }
}
