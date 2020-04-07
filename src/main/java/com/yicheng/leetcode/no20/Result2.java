package com.yicheng.leetcode.no20;

import java.util.Stack;

// 时间复杂度：O(n)
public class Result2 {

    public static void main(String[] args) {
        boolean flag = isValid("(((){})[]())");
        System.out.println(flag);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
