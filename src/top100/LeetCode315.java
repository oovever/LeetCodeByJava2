package top100;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author OovEver
 * 2018/1/28 14:56
 * https://segmentfault.com/a/1190000008233819
 */
public class LeetCode315 {
    class Node {
        Node left, right;
        int val, sum, dup = 1;
        public Node(int v) {
            val = v;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        Integer[] ans = new Integer[nums.length];
        Node root = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            root = insert(nums[i], root, ans, i, 0);
        }
        return Arrays.asList(ans);
    }
    private Node insert(int num, Node node, Integer[] ans, int i, int preSum) {
        if (node == null) {
            node = new Node(num);
            ans[i] = preSum;
        } else if (node.val == num) {
            node.dup++;
            ans[i] = preSum + node.sum;
        } else if (node.val > num) {
            node.sum++;
            node.left = insert(num, node.left, ans, i, preSum);
        } else {
            node.right = insert(num, node.right, ans, i, preSum + node.dup + node.sum);
        }
        return node;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 6, 1};
        LeetCode315 test = new LeetCode315();
        System.out.println(test.countSmaller(nums));
    }
}
