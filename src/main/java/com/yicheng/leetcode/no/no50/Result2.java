package com.yicheng.leetcode.no.no50;


public class Result2 {

    public static void main(String[] args) {
        double result = myPow(2, 5);
        System.out.println(result);
    }

    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return pow(x, N);
    }

    private static double pow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = pow(x, n / 2);
        return n % 2 == 0 ? half * half : half * half * x;
    }
}
