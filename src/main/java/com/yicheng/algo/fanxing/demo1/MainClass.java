package com.yicheng.algo.fanxing.demo1;

public class MainClass {

    public static void main(String[] args) {

        // 泛型类在创建对象的时候，来指定操作的具体数据类型
        Generator<String> testStr = new Generator<>("Tom");
        System.out.println(testStr.toString());
        testStr.setKey("zhang");
        System.out.println(testStr.toString());
        String key1 = testStr.getKey();
        System.out.println(key1);
        System.out.println("--------------------");
        
        Generator<Integer> testInt = new Generator<>(123);
        int key2 = testInt.getKey();
        System.out.println(key2);
        System.out.println("--------------------");

        // 泛型类在创建的时候，如果没有类型，将按时Object类
        Generator testObject = new Generator(true);
        Object key3 = testObject.getKey();
        System.out.println(key3);

        // 泛型类，不支持使用基本数据类型
//        Generator<int> algo = new Generator<int>(100);

        // 同一泛型类，根据不同的数据类型创建的对象，本质上是同一类型
        System.out.println("--------------------");
        System.out.println(testInt.getClass());
        System.out.println(testStr.getClass());
        System.out.println(testInt.getClass() == testStr.getClass());
    }
}
