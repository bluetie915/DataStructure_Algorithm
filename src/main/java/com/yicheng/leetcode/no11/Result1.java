package com.yicheng.leetcode.no11;

public class Result1 {

    public static void main(String[] args) {
        int result = maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(result);
    }

    public static int maxArea(int[] height) {
        int result = 0;
        int temp = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = (i-j) * Integer.min(height[i], height[j]);
                if (temp > result) {
                    result = temp;
                }
            }
        }
        return result;
    }
}
