package com.yicheng.leetcode.no69;

/**
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Result1 {

    public static void main(String[] args) {
        Result1 result1 = new Result1();
        int result = result1.mySqrt(9);
        System.out.println(result);
    }

    public int mySqrt(int x) {
        long left = 0;
        long right = x;
        while (left < right) {
            long min = (left + right + 1) / 2;
            if (min * min > x) {
                right = min - 1;
            } else {
                left = min;
            }
        }
        return (int)left;
    }
}