package com.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 张艺成
 * @date 2020/9/27 0027 8:55
 */

public class Test1 {

    // 验证i++和++i的区别
    @Test
    public void test1() {
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


    // 初始化的数组都是0
    @Test
    public void test2() {
        int[] param = new int[4];
        System.out.println(Arrays.toString(param));
    }

    // 验证list的equals
    @Test
    public void test3() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
//        list2.add(3);
        System.out.println(list1.equals(list2));
    }



}
