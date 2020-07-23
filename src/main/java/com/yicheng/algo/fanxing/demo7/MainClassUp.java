package com.yicheng.algo.fanxing.demo7;

import java.util.ArrayList;

public class MainClassUp {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<MiniCat> miniCats = new ArrayList<>();

//        此时Cats代表上限
//        cats.addAll(animals);
        cats.addAll(cats);
        cats.addAll(miniCats);

//        showAnimal(animals);
        showAnimal(cats);
        showAnimal(miniCats);
    }

    /**
     * 泛型上限通配符，传递的集合类型，只能是Cat或者Cat的子类类型
     * @param list
     */
    public static void showAnimal(ArrayList<? extends Cat> list) {
//        由于不知道该 ? 将代表什么类型，所以在该方法中不可以向集合中添加元素
//        list.add(new Animal());
//        list.add(new Cat());
//        list.add(new MiniCat());
        for (int i = 0; i < list.size(); i++) {
            Cat cat = list.get(i);
            System.out.println(cat);
        }
    }
}
