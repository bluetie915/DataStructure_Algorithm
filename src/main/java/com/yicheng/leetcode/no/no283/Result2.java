package com.yicheng.leetcode.no.no283;

public class Result2 {

    public static void main(String[] args) {
        int[] result = moveZeroes(new int[]{2, 5, 0, 5, 77, 0, 44, 0, 45});
        for (int a : result) {
            System.out.println(a);
        }
    }

    public static int[] moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
        return nums;
    }
}
