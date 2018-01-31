package top150;

/**
 * @author OovEver
 * 2018/1/31 22:43
 */
public class LeetCode134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, tank = 0, index = 0;
        for (int i = 0; i < cost.length; i++) {
            int cur = gas[i] - cost[i];

            tank += cur;
            if (tank < 0) {//if sum < 0, index can only start from i + 1
                index = i + 1;
                tank = 0;
            }
            total += cur;
        }
        return total < 0 ? -1 : index;
    }

    public static void main(String[] args) {
        int[] gas = {2,4};
        int[] cost = {3,4};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
