package com.yicheng.leetcode.no633;

/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 *
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 */

public class Result1 {

    public static void main(String[] args) {
        boolean result = judgeSquareSum(5);
        System.out.println(result);
    }

    public static boolean judgeSquareSum(int c) {
        if (c < 0)
            return false;
        int i = 0, j = (int)Math.sqrt(c);
        while (i <= j) {
            int result = i * i + j * j;
            if (c == result)
                return true;
            if (c < result)
                j--;
            if (c > result)
                i++;
        }
        return false;
    }
}
