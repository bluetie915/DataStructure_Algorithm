package com.yicheng.leetcode.no.no70;

public class Result2 {

    public static void main(String[] args) {
        int result = climbStairs(6);
        System.out.println(result);
    }

    public static int climbStairs(int n) {
        if (n < 3)
            return n;
        int f1 = 1, f2 = 2, f3 = 3;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
