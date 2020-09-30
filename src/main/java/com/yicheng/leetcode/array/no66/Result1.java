package com.yicheng.leetcode.array.no66;

import java.util.Arrays;

/**
 * @author 张艺成
 * @date 2020/9/28 0028 17:14
 */
public class Result1 {

    public static void main(String[] args) {
        int[] input = new int[]{4, 3, 2, 1};
        int[] result = plusOne(input);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int j = length - 1; j >= 0; j--) {
            digits[j]++;
            digits[j] = digits[j] % 10;
            if (digits[j] != 0)
                return digits;
        }
        digits = new int[length + 1];
        digits[0] = 1;
        return digits;
    }
}
