package com.yicheng.leetcode.tree.no108;

import com.yicheng.leetcode.tree.node.TreeNode;

/**
 * @author 张艺成
 * @date 2020/10/9 0009 23:44
 */
public class Result1 {
    public static void main(String[] args) {
        int[] input = {-10, -3, 0, 5, 9};
        System.out.println(sortedArrayToBST(input).val);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public static TreeNode helper(int[] nums, int left, int right) {
        if (left > right)
            return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}
