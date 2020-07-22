package com.yicheng.algo.fanxing.demo5;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ProductGetter<Integer> productGetter = new ProductGetter<>();
        int[] products = {100, 200, 500};
        for (int i = 0; i < products.length; i++) {
            productGetter.addProduct(products[i]);
        }
        // 泛型类的成员方法的调用 类型只能使用泛型类的泛型
        Integer product = productGetter.getProduct();
        System.out.println(product + "\t" + product.getClass().getSimpleName());

        System.out.println("--------------------");
        ArrayList<String> strList = new ArrayList<>();
        strList.add("笔记本电脑");
        strList.add("手机");
        strList.add("扫地机器人");
        // 泛型方法的调用，类型是通过调用方法的时候来指定
        String product1 = productGetter.getProduct(strList);
        System.out.println(product1 + "\t" + product1.getClass().getSimpleName());

        System.out.println("--------------------");
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1000);
        intList.add(5000);
        intList.add(10000);
        Integer product2 = productGetter.getProduct(intList);
        System.out.println(product2 + "\t" + product2.getClass().getSimpleName());

        // 调用多个泛型类型的静态泛型方法
        System.out.println("--------------------");
        ProductGetter.printType(100, "java", true);

        // 可变参数的泛型方法的调用
        System.out.println("--------------------");
        ProductGetter.print(1, 2, 3, 4, 5);
        productGetter.print("a", "b", "c", 3, true);
    }
}
