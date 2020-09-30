package com.yicheng.leetcode.no.no50;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 */

public class Result1 {

    public static void main(String[] args) {
        double result = myPow(2, -2);
        System.out.println(result);
    }

    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        for (int i = 0; i < N; i++) {
            result = result * x;
        }
        return result;
    }
}
