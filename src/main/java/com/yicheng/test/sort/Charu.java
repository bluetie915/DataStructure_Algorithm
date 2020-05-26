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
        int preIndex, current;
        for (int i = 1; i < arr.length; i++) {
            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }
}
