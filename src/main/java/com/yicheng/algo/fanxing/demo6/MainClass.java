package com.yicheng.algo.fanxing.demo6;

public class MainClass {
    public static void main(String[] args) {
        Box<Number> box1 = new Box<>();
        box1.setFirst(100);
        showBox(box1);

        Box<Integer> box2 = new Box<>();
        box2.setFirst(200);
        showBox(box2);
    }

    public static void showBox(Box<? extends Number> box) {
        Number first = box.getFirst();
        System.out.println(first);
    }
}
