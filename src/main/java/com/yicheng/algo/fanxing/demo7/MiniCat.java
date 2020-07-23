package com.yicheng.algo.fanxing.demo7;

public class MiniCat extends Cat {

    public int leval;

    public MiniCat(String name, int age, int leval) {
        super(name, age);
        this.leval = leval;
    }

    @Override
    public String toString() {
        return "MiniCat{" +
                "leval=" + leval +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
