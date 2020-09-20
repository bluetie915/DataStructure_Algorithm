package com.yicheng.leetcode.array.no35;

/**
 * @author 张艺成
 * @date 2020/9/20 0020 16:22
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 */
public class Result1 {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 6};
        int target = 2;
        int result = searchInsert(input, target);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        if (target <= nums[0])
            return 0;
        if (target > nums[nums.length - 1])
            return nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (target > nums[i] && target <= nums[i + 1]) {
                return i + 1;
            }
        }
        return -1;
    }
}
