package com.yicheng.algo.fanxing.demo4;

/**
 * 实现泛型接口的类不是泛型类，需要明确实现泛型接口的数据类型
 */
public class Apple implements Generator<String> {

    @Override
    public String getKey() {
        return "Hello Generator";
    }
}
