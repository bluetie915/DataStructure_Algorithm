package com.yicheng.test.linkedlist;

public class LinkedList<E> {

    private Node root = new Node(); // 空节点
    private Node next; // 下一个节点
    private Node last; // 始终表示最后一个节点
    private int size;

    public int size() {
        return this.size;
    }

    // add一个节点
    public void add(E e) {
        next = new Node(e);
        if (size == 0) {
            root.setNext(next);
            last = next;
            size++;
        } else {
            last.setNext(next);
            last = next;
            size++;
        }
    }

    // get一个节点
    public Object get(int index) {
        checkIndex(index);
        Node node =  root.getNext();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getData();
    }

    // set节点元素
    public void set(int index, E e) {
        checkIndex(index);
        Node node = root.getNext();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setData(e);
    }

    // remove节点元素
    public void remove(int index) {
        checkIndex(index);
        Node node = root.getNext();
        if (index != 0) {
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
            Node preNode = node.getPrevious();
            if (index != size - 1) {
                Node nextNode = root.getNext();
                preNode.setNext(nextNode);
            } else {
                preNode.setNext(null);
            }
            node.setData(null);
            node.setNext(null);
        } else {
            Node nextNode = node.getNext();
            root.setNext(nextNode);
            node.setData(null);
            node.setNext(null);
        }
        size--;
    }

    // 插入节点的方法
//    public void insert(int index; E e) {
//
//    }

    // 检查下标是否合法
    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(outofBoundsMsg(index));
        }
    }

    private String outofBoundsMsg(int index) {
        return "Index:" + index + ",Size:" + size;
    }
}
