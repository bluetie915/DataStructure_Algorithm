package com.yicheng.leetcode.no.no22;

import java.util.ArrayList;
import java.util.List;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且有效的括号组合。
 */

public class Result1 {

    private static List<String> result;

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        result = new ArrayList<String>();
        generate(0, 0, n, "");
        return result;
    }

    private static void generate(int left, int right, int n, String s) {
        if (left == n && right == n) {
            result.add(s);
            return;
        }
        if (left < n)
            generate(left + 1, right, n, s + "(");
        if (left > right)
            generate(left, right + 1, n, s + ")");
    }
}
