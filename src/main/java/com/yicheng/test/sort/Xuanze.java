package com.yicheng.test.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Xuanze {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 6, 1, 22, 98, 65, 3, 10, 85, 44};
//        List<Integer> result = Arrays.stream(selectionSort(arr)).boxed().collect(Collectors.toList());
//        System.out.println(result);
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {
        int currMin, minIndex;
        for (int i = 0; i < arr.length; i++) {
            currMin = arr[i];
            minIndex = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (currMin > arr[j + 1]) {
                    currMin = arr[j + 1];
                    minIndex = j + 1;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = currMin;
        }
        return arr;
    }
}
