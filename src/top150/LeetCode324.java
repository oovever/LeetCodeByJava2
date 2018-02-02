package top150;

/**
 * @author OovEver
 * 2018/2/1 14:36
 * 关键:
1 如果不考虑空间和时间，先排序。从数组中挑选出n/2个最小的元素，每次从最小数组中挑选一个最大的元素，然后
挑选最大数组中最大元素放入结果集，重复上述操作，直至结束。

2 摆放的时候要把较小数组中最大的元素优先放在前面，把较大数组中最大的放在前面
才能避免出现重复元素的时候不是波形。
我把较小元素从小到达排列，把较大元素从小到大排列，可能导致不是波形的排序
例如整个数组:4 5 5 6，较小数组是:4 5,较大数组为:5 6
4 5 5造成不符合要求，5 6 4符合

3参考解法:http://blog.csdn.net/qingyuanluofeng/article/details/58666552
采用三路划分+中位数方式。
通过将下标(2*i + 1) % (len|1)的方式可以构成1 3 5 0 2 4 这种下标，这种下标
刚好是奇数下标为较大数，偶数下标为较小数。
采用三路划分，将大于中位数的放在前面，中位数位置不变，小于中位数的放在后面
再加上下标映射，就可以组成
 */
public class LeetCode324 {
    public void wiggleSort(int[] nums) {
        /* quick select: find the middle element
         * 3 way partitions: [h, l, ...]
         * [2, 0, 3, 1], [2, 0, 3, 1, 4]
         */
        n = nums.length;
        int mid = quickSelect(nums, 0, nums.length - 1, nums.length / 2);
        partition(nums, 0, nums.length - 1, mid);
    }

    int n;
    private void partition(int[] nums, int l, int r, int mid) {
        int i = l;
        while(i <= r) {
            //大于中位数，交换到最左边
            if(nums[mapping(i)] > mid) swap(nums, mapping(i++), mapping(l++));
                //小于中位数，交换到最右边
            else if(nums[mapping(i)] < mid) swap(nums, mapping(i), mapping(r--));
            else i++;

        }
    }

    private int mapping(int i) {
        return (2 * i + 1) % (n | 1);
    }

    private int quickSelect(int[] nums, int l, int r, int k) {
        if(l >= r)  return nums[l];

        int pivot = nums[r];
        int index = l;
        for(int i = l; i < r; i++) {
            if(nums[i] < pivot) swap(nums, i, index++);
        }
        // swap the pivot to the correct position
        swap(nums, index, r);
        if(index == k) return nums[index];
        else if(index < k) return quickSelect(nums, index + 1, r, k);
        else return quickSelect(nums, l, index - 1, k);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] num = {1, 5, 1, 1, 6, 4};
        LeetCode324 test = new LeetCode324();
        test.wiggleSort(num);
        for(int i=0;i<num.length;i++) {
            System.out.print(num[i]+" ");
        }

    }
}
