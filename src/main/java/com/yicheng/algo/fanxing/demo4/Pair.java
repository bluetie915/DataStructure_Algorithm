package com.yicheng.algo.fanxing.demo4;

/**
 * 泛型接口的实现类是一个泛型类，那么要保证实现接口的泛型类的泛型标识符包含接口的泛型标识
 * @param <T>
 * @param <E>
 */
public class Pair<T, E> implements Generator<T> {

    private T key;
    private E value;

    public Pair(T key, E value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public T getKey() {
        return key;
    }

    public E getValue() {
        return value;
    }
}
