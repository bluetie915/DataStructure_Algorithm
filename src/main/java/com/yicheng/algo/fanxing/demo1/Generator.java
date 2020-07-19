package com.yicheng.algo.fanxing.demo1;

public class Generator<T> {

    // T是由外部使用类的时候来指定
    private T key;

    public Generator(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Generator{" +
                "key=" + key +
                '}';
    }
}
