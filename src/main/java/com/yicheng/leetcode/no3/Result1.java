package com.yicheng.leetcode.no3;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */

public class Result1 {

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("pwwkew");
        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        Map<Character, Integer> map;
        int currLength = 1;
        for (int i = 0; i < s.length(); i++) {
            map = new HashMap<Character, Integer>();
            for (int j = i; j < s.length(); j++) {
                if (!map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), j);
                    currLength = Integer.max(map.size(), currLength);
                } else {
                    break;
                }
            }
        }
        return currLength;
    }
}
