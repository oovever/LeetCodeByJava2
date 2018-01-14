package HashTable;

/**
 * @author OovEver
 * 2018/1/12 21:59
 */
public class LeetCode204 {
    public int countPrimes(int n) {
        boolean[] notprims = new boolean[n];
        int count = 0;
        for(int i=2;i<n;i++) {
            if (notprims[i] == false) {
                count++;
                for(int j=2;i*j<n;j++) {
                    notprims[i * j] = true;
                }
            }
        }
        return count;
    }
}
