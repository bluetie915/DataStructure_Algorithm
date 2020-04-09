package com.yicheng.leetcode.no155;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Result1 {

    Deque<Integer> stack = new LinkedList<Integer>();

    public Result1() {

    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

//    public int getMin() {
//        stack.
//    }

}
