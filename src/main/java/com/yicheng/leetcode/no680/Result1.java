package com.yicheng.leetcode.no680;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 */

public class Result1 {

    public static void main(String[] args) {
        boolean result = validPalindrome("abc");
        System.out.println(result);
    }

    public static boolean validPalindrome(String s) {
        if (s == null)
            return false;
        int chance = 1;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else if (chance == 1 && s.charAt(i + 1) == s.charAt(j)) {
                i += 2;
                j--;
                chance--;
            } else if (chance == 1 && s.charAt(i) == s.charAt(j + 1)) {
                i++;
                j -= 2;
                chance--;
            } else {
                return false;
            }
        }
        return true;
    }
}
