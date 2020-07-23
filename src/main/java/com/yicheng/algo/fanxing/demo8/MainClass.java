package com.yicheng.algo.fanxing.demo8;

import java.lang.reflect.Field;

public class MainClass {
    public static void main(String[] args) {

        Erasure<Integer> erasure = new Erasure<>();
        Class<? extends Erasure> elz = erasure.getClass();
        Field[] declaredFields = elz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName() + " : " + declaredField.getType().getSimpleName());
        }
    }
}
