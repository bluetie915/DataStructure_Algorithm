package com.yicheng.leetcode.no.no70;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 */

public class Result1 {

    public static void main(String[] args) {
        int result = climbStairs(6);
        System.out.println(result);
    }

    public static int climbStairs(int n) {
        if (n < 3)
            return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
