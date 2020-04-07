package com.yicheng.leetcode.no283;

public class Result1 {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (; j < nums.length; j++) {
            nums[j] = 0;
        }
        for (int m : nums) {
            System.out.println(m);
        }
    }


    public static void main(String[] args) {
        int[] input = {1, 3, 6, 0, 6, 8, 0, 565, 0, 7};
        moveZeroes(input);
    }

}
