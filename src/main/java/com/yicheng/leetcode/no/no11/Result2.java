package com.yicheng.leetcode.no.no11;

// 时间复杂度 O(n)
public class Result2 {

    public static void main(String[] args) {
        int result = maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(result);
    }

    public static int maxArea(int[] height) {
        int result = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i ++] : height[j --];
            int temp = (j - i + 1) * minHeight;
            result = Math.max(result, temp);
        }
        return result;
    }
}
