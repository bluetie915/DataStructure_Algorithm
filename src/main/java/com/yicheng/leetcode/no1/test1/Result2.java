package com.yicheng.leetcode.no1.test1;

import java.util.HashMap;
import java.util.Map;

public class Result2 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 13;
        int result[] = twoSum(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && i != map.get(temp)) {
                return new int[]{i, map.get(temp)};
            }
        }
        throw new IllegalArgumentException("no sum solution");
    }
}
