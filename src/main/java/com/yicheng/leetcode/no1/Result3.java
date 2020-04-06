package com.yicheng.leetcode.no1;

import java.util.HashMap;
import java.util.Map;

public class Result3 {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 26;
		int result[] = twoSum(nums, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

    // 方法三：一遍哈希表 时间复杂度：O(n)
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
