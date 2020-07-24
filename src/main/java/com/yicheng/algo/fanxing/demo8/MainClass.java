package com.yicheng.algo.fanxing.demo8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainClass {
    public static void main(String[] args) {

        Erasure<Integer> erasure = new Erasure<>();
        Class<? extends Erasure> elz = erasure.getClass();
        Field[] declaredFields = elz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName() + " : " + declaredField.getType().getSimpleName());
        }

        System.out.println("--------------------");
        // 获取所有方法
        Method[] declaredMethods = elz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            // 打印方法名和方法的返回值
            System.out.println(declaredMethod.getName() + " : " + declaredMethod.getReturnType().getSimpleName());
        }

        System.out.println("--------------------");
        Class<InfoImpl> infoClass = InfoImpl.class;
        // 获取所有方法
        Method[] infoImplMethods = infoClass.getDeclaredMethods();
        for (Method infoImplMethod : infoImplMethods) {
            // 打印方法名和方法的返回值
            System.out.println(infoImplMethod.getName() + " : " + infoImplMethod.getReturnType().getSimpleName());
        }
    }
}
