package com.yicheng.algo.fanxing.demo5;

import java.util.ArrayList;
import java.util.Random;

/**
 * 抽奖器
 * @param <T>
 */
public class ProductGetter<T> {

    Random random = new Random();
    // 奖品
    private T product;

    // 奖品池
    ArrayList<T> list = new ArrayList<>();

    // 添加奖品
    public void addProduct(T t) {
        list.add(t);
    }

    // 抽奖
    public T getProduct() {
        product = list.get(random.nextInt(list.size()));
        return product;
    }

    /**
     * 定义泛型方法
     * @param list 参数
     * @param <E> 泛型标识，具体类型，由调用方法的时候来指定
     * @return
     */
    public <E> E getProduct(ArrayList<E> list) {
        return list.get(random.nextInt(list.size()));
    }
}
