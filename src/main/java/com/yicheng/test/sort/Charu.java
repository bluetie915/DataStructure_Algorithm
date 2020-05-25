package com.yicheng.test.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Charu {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 6, 1, 22, 98, 65, 3, 10, 85, 44};
        List<Integer> result = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(result);
    }

    static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {

                }
            }
        }
        return null;
    }
}
