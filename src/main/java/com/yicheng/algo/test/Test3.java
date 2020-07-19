package com.yicheng.algo.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
        int temp = 50;
        for (int i = 0; i < temp; i++) {
            System.out.println(random.nextInt(5));
        }
    }
}
