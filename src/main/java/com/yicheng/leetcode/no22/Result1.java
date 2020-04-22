package com.yicheng.leetcode.no22;

import java.util.List;

public class Result1 {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        generate(0, 2*n, "");
        return null;
    }

    private static void generate(int level, int max, String s) {
        if (level >= max) {
            System.out.println(s);
            return;
        }
        generate(level + 1, max, s + "(");
        generate(level + 1, max, s + ")");
    }
}
