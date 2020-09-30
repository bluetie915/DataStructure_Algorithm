package com.yicheng.leetcode.no.no231;

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */

public class Result1 {
    public static void main(String[] args) {
        Result1 result1 = new Result1();
        boolean result = result1.isPowerOfTwo(8);
        System.out.println(result);

    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
