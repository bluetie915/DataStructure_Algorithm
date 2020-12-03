package com.yicheng.algo.test;

/**
 * @author 张艺成
 * @date 2020/10/21 0021 21:32
 */
public class Test5 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("zhangsan");
        System.out.println(student.getName());
        updateName(student);
        System.out.println(student.getName());

        String m = new String("123");
        System.out.println(m);
        get(m);
        System.out.println(m);
    }

    static void get(String param) {
        param = "456";
    }

    static void updateName(Student student) {
        student.setName("lisi");
    }
}
