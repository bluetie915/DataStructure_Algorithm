package com.yicheng.leetcode.no.no84;

/**
 * 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 *
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 */

public class Result1 {

    public static void main(String[] args) {
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        int result = largestRectangleArea(heights);
        System.out.println(result);
    }

    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j <= i; j++) {
                int minHeight = Integer.MAX_VALUE;
                for (int k = j; k <= i; k++) {
                    if (heights[k] < minHeight) {
                        minHeight = heights[k];
                    }
                }
                int temp = minHeight * (i - j + 1);
                maxArea = Math.max(temp, maxArea);
            }

        }
        return maxArea;
    }
}
