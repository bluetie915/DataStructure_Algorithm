package com.yicheng.algo.stack;

public class Stack<T> {

    T[] stack;
    int topIndex = -1;

    public Stack() {
        stack = (T[])new Object[10];
    }

    public Stack(int length) {
        stack = (T[])new Object[10];
    }

    void push(T data) {
        topIndex++;
        stack[topIndex] = data;
    }

    T pop() {
        T result = stack[topIndex];
        topIndex--;
        return result;
    }


    T peek() {
        return stack[topIndex];
    }

    boolean isFull() {
        return topIndex == stack.length - 1;
    }

    boolean isEmpty() {
        return topIndex == -1;
    }

    void printStack() {
        System.out.println("-----printStack start-----");
        for (int i = 0; i <= topIndex; i++) {
            System.out.println(stack[i]);
        }
        System.out.println("-----printStack end-----");
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack(3);
        stack1.push(2);
        stack1.push(3);
        System.out.println(stack1.isFull());
        stack1.push(22);
        stack1.printStack();
        System.out.println(stack1.peek());
        System.out.println(stack1.isFull());
        System.out.println(stack1.pop());
    }
}
