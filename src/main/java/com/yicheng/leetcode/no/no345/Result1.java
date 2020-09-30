package com.yicheng.leetcode.no.no345;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 输入: "hello"
 * 输出: "holle"
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 */

public class Result1 {

    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    
    public static void main(String[] args) {
        String result = reverseVowels("hello");
        System.out.println(result);
    }

    public static String reverseVowels(String s) {
        if (s == null)
            return null;
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        char temp;
        while (i < j) {
            if (vowels.contains(chars[i]) && vowels.contains(chars[j])) {
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
                continue;
            }
            if (!vowels.contains(chars[i]))
                i++;
            if (!vowels.contains(chars[j]))
                j--;
        }
        return new String(chars);
    }
}
