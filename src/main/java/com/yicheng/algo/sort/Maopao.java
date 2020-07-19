package com.yicheng.algo.sort;

import java.util.Arrays;

public class Maopao {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 6, 1, 22, 98, 65, 3, 10, 85, 44};
//        List<Integer> result = Arrays.stream(bubbleSort(arr)).boxed().collect(Collectors.toList());
//        System.out.println(result);
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
