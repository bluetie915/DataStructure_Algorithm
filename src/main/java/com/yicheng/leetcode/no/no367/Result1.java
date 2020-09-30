package com.yicheng.leetcode.no.no367;

/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 */

public class Result1 {

    public static void main(String[] args) {
        Result1 result1 = new Result1();
        boolean result = result1.isPerfectSquare(5);
        System.out.println(result);
    }

    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;
        while (left < right) {
            long min = (left + right + 1) / 2;
            long temp = min * min;
            if (temp == num)
                return true;
            if (min * min > num) {
                right = min - 1;
            } else {
                left = min;
            }
        }
        return false;
    }
}
