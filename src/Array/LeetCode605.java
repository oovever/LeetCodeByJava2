package Array;

/**
 * Created by OovEver on 2017/11/18.
 */
public class LeetCode605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 1) {
                return false;
            }
            return true;
        }
        int num = 0;
        int fL = flowerbed.length;
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            num++;
            if (num == n) {
                return true;
            }
        }
        for(int i=1;i<flowerbed.length-1;i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0&&flowerbed[i]!=1) {
                flowerbed[i] = 1;
                num++;
            }
            if (num == n) {
                return true;
            }
        }
        if (flowerbed[fL - 2] == 0 && flowerbed[fL - 1] == 0) {
            num++;
        }
        if (num >= n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,0,1};
        System.out.println(canPlaceFlowers(nums,1));
    }
}
