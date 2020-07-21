package com.yicheng.algo.fanxing.demo5;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        ProductGetter<Integer> productGetter = new ProductGetter<>();
        ArrayList<String> strList = new ArrayList<>();
        strList.add("笔记本电脑");
        strList.add("手机");
        strList.add("扫地机器人");
        // 泛型方法的调用，类型是通过调用方法的时候来指定
        String product1 = productGetter.getProduct(strList);
        System.out.println(product1 + "\t" + product1.getClass().getSimpleName());

    }
}
