package com.yicheng.algo.linkedlist;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.toString(list));
        list.add(6);
        list.add(45);
        list.add(8);
        list.add(34);
        Integer result = list.get(1);
//        list.remove(2);
        System.out.println(list.toString(list));
    }
}
