package com.yicheng.algo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 2);
        map.put(4, 3);
        map.put(6, 3);
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue(4));
        System.out.println(map);
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        System.out.println(entries);
    }
}
