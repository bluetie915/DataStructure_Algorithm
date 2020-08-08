package com.yicheng.algo.fanxing.demo10;

import java.lang.reflect.Constructor;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor();
        Person person = constructor.newInstance();


        Class personClass1 = Person.class;
        Constructor constructor1 = personClass1.getConstructor();
        Object o = constructor1.newInstance();
    }
}
