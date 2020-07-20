package com.yicheng.algo.fanxing.demo4;

public class MainClass {
    public static void main(String[] args) {

        Apple apple = new Apple();
        String key = apple.getKey();
        System.out.println(key);

        System.out.println("--------------------");
        Pair<String, Integer> pair = new Pair<>("count", 100);
        String key1 = pair.getKey();
        Integer value = pair.getValue();
        System.out.println(key1 + "=" + value);

    }
}
