package Array;

/**
 * @Author OovEver
 * @Date 2017/11/29 16:38
 */
public class LeetCode45 {
    public static int jump(int[] nums) {
        int ret = 0;//当前跳数
        int last = 0;//上一跳可达最远距离
        int cur = 0;//当前一跳可达最远距
        for (int i = 0; i < nums.length; ++i) {
            //无法向前继跳直接返回
            if(i>cur){  //有可能无论怎么跳，都不能到达终点或者越过终点，比如[3,2,1,0,4]。
                return -1;
            }
            //需要进行下次跳跃，则更新last和当执行的跳数ret
            if (i > last) {
                last = cur;
                ++ret;
            }
            //记录当前可达的最远点
            cur = Math.max(cur, i+nums[i]);
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }

}
