package com.test;

import org.junit.jupiter.api.Test;

/**
 * @author 张艺成
 * @date 2020/9/27 0027 8:55
 */

public class Test1 {

    @Test
    public void test() {
        int[] input = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(input, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
