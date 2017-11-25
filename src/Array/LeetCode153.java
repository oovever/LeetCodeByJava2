package Array;

public class LeetCode153 {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            }
            return nums[i + 1];
        }
        return Math.min(nums[0], nums[nums.length - 1]);



//        public int findMin(int[] num) {
//            if (num == null || num.length == 0) {
//                return 0;
//            }
//            if (num.length == 1) {
//                return num[0];
//            }
//            int start = 0, end = num.length - 1;
//            while (start < end) {
//                int mid = (start + end) / 2;
//                if (mid > 0 && num[mid] < num[mid - 1]) {
//                    return num[mid];
//                }
//                if (num[start] <= num[mid] && num[mid] > num[end]) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//            return num[start];
//        }
    }

}
