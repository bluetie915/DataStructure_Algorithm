package com.yicheng.algo.fanxing.demo3;

public class MainClass {
    public static void main(String[] args) {

        ChildFirst<String> childFirst = new ChildFirst<>();
        childFirst.setValue("zhang");
        System.out.println(childFirst.getValue());

        System.out.println("--------------------");
        ChildSecond childSecond = new ChildSecond();
        childSecond.setValue(123);
        Integer value = childSecond.getValue();
    }
}
