package Array;

/**
 * @Author OovEver
 * @Date 2017/11/27 16:20
 */
public class LeetCode11 {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        while (low < high) {
            max = Math.max(max, Math.min(height[low], height[high]) * (high - low));
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}
