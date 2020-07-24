package com.yicheng.algo.fanxing.demo9;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
//        ArrayList[] list = new ArrayList[5];
//        ArrayList<String>[] listArr = list;

        ArrayList<String>[] listArr = new ArrayList[5];

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("abc");

//        listArr[0] = intList;
        listArr[0] = strList;

        String s = listArr[0].get(0);
        System.out.println(s);
    }
}
