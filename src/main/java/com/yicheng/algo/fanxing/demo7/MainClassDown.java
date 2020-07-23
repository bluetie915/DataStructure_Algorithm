package com.yicheng.algo.fanxing.demo7;

import java.util.ArrayList;

public class MainClassDown {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<MiniCat> miniCats = new ArrayList<>();

//        此时Cats代表上限
//        cats.addAll(animals);
        cats.addAll(cats);
        cats.addAll(miniCats);

        showAnimal(animals);
        showAnimal(cats);
//        showAnimal(miniCats);
    }

    /**
     * 类型通配符的下限，要求集合只能是Cat或者Cat的父类类型
     * @param list
     */
    public static void showAnimal(ArrayList<? super Cat> list) {
        for (int i = 0; i < list.size(); i++) {
//        虽然不知道该 ? 将代表什么类型，但是只要是Cat的父类即可
//        list.add(new Animal());
        list.add(new Cat("jerry", 2));
        list.add(new MiniCat("tom", 2, 1));
            Object object = list.get(i);
            System.out.println(object);
        }
    }
}
