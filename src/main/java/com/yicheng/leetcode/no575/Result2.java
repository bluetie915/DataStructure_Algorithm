package com.yicheng.leetcode.no575;

import java.util.HashSet;
import java.util.Set;

public class Result2 {

    public static void main(String[] args) {
        int[] candies = new int[]{1, 1, 2, 2, 3, 3};
        int result = distributeCandies(candies);
        System.out.println(result);
    }

    public static int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }

        return Math.min(set.size(), candies.length / 2);
    }
}
