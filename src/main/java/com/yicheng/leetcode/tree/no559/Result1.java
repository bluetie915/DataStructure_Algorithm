package com.yicheng.leetcode.tree.no559;

import com.yicheng.node.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * N叉树的最大深度
 *
 * @author 张艺成
 * @date 2020/10/21 0021 17:11
 */
public class Result1 {

    public static void main(String[] args) {
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        List<Node> list = new ArrayList<>();
        list.add(node4);
        list.add(node5);
        Node node1 = new Node(3, list);
        Node node2 = new Node(2);
        Node node3 = new Node(4);
        List<Node> list1 = new ArrayList<>();
        list1.add(node1);
        list1.add(node2);
        list1.add(node3);
        Node node = new Node(1, list1);
        int result = maxDepth(node);
        System.out.println(result);
    }


    static int max = 0;
    public static int maxDepth(Node root) {
        if (root == null)
            return 0;
        for (Node node : root.children) {
            if (node.children == null)
                return max + 1;
            max = Math.max(max, maxDepth(node)) + 1;
        }
        return max + 1;
    }
}
