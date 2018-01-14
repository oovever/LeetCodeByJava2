package HashTable;

/**
 * @author OovEver
 * 2018/1/14 16:00
 */
public class LeetCode274 {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] bucket = new int[n + 1];
        for(int i=0;i<citations.length;i++) {
            if (citations[i] >= n) {
                bucket[n]++;
            } else {
                bucket[citations[i]]++;
            }
        }
        int count = 0;
        for(int i=n;i>=0;i--) {
            count += bucket[i];
            if (count >= i) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 3, 3, 3};
        System.out.println(hIndex(nums));

    }
}
