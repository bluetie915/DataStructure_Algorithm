package com.yicheng.leetcode.array.no53;

/**
 * @author 张艺成
 * @date 2020/9/28 0028 8:26
 */
public class Result1 {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}