package com.yicheng.test.linkedlist;

public class LinkedList<E> {

    private Node<E> root = new Node<E>(); // 空节点
    private Node<E> next; // 下一个节点
    private Node<E> last; // 始终表示最后一个节点
    private int size;

    public int size() {
        return this.size;
    }

    // add一个节点
    public void add(E e) {
        next = new Node<E>(e);
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
    public E get(int index) {
        checkIndex(index);
        Node<E> node = root.getNext();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getData();
    }

    // set节点元素
    public void set(int index, E e) {
        checkIndex(index);
        Node<E> node = root.getNext();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setData(e);
    }

    // remove节点元素
    public void remove(int index) {
        checkIndex(index);
        Node<E> node = root.getNext();
        if (index != 0) {
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
            Node<E> preNode = node.getPrevious();
            if (index != size - 1) {
                Node<E> nextNode = root.getNext();
                preNode.setNext(nextNode);
            } else {
                preNode.setNext(null);
            }
            node.setData(null);
            node.setNext(null);
        } else {
            Node<E> nextNode = node.getNext();
            root.setNext(nextNode);
            node.setData(null);
            node.setNext(null);
        }
        size--;
    }

    // 插入节点的方法
    public void insert(int index, E e) {
        checkIndex(index);
        Node<E> node = root.getNext();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        Node<E> newNode = new Node<E>(e);
        if (index == 0) {
            root.setNext(newNode);
            newNode.setNext(node);
        } else {
            Node<E> preNode = node.getPrevious();
            preNode.setNext(newNode);
            newNode.setNext(node);
        }
        size++;
    }

    // 重写toString方法
    public String toString(LinkedList list) {
        if (list.size() == 0)
            return "[]";
        StringBuffer result = new StringBuffer("[");
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i) + ",");
        }
        return result.deleteCharAt(result.length() - 1).append("]").toString();
    }

    // 检查下标是否合法
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(outofBoundsMsg(index));
        }
    }

    private String outofBoundsMsg(int index) {
        return "Index:" + index + ",Size:" + size;
    }
}
