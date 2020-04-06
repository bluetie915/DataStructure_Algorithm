package com.yicheng.test;

public class Queue {

    int[] queue;

    int head = 0;
    int tail = 0;

    public Queue() {
        queue = new int[10];
    }

    public Queue(int length) {
        queue = new int[length];
    }

    void insert(int data) {
        queue[tail] = data;
        tail++;
    }

    int remove() {
        int result = queue[head];
        head++;
        return result;
    }

    void printQueue() {
        System.out.println("-----printQueue start-----");
        for (int i = head; i < tail; i++) {
            System.out.println(queue[i]);
        }
        System.out.println("-----printQueue end-----");
    }

    boolean isEmpty() {
        return head == tail;
    }

    boolean isFull() {
        return tail - head + 1 == queue.length;
    }

    int peek() {
        return queue[head];
    }

    public static void main(String[] args) {
        Queue queue1 = new Queue(4);
        System.out.println(queue1.isEmpty());
        queue1.insert(4);
        queue1.insert(55);
        queue1.insert(8);
        System.out.println(queue1.isFull());
        queue1.printQueue();
        System.out.println(queue1.peek());
        System.out.println(queue1.remove());
    }
}
