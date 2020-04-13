package com.yicheng.leetcode.no169;

import java.util.*;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Result1 {

    public static void main(String[] args) {
        int result = majorityElement(new int[]{2, 2, 2, 5, 5, 55, 5, 5});
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            } else {
                int count = 1;
                map.put(nums[i], count);
                count++;
            }
        }
        int maxNum = 0;
        int key = 0;
        for (int a : map.keySet()) {
            int value = map.get(a);
            if (maxNum < value) {
                maxNum = value;
                key = a;
            }
        }
        return key;
    }
}
