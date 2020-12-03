package com.yicheng.algo.dfs;

import com.yicheng.node.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(9);
        node.right.right = new TreeNode(4);
        node.right.right.left = new TreeNode(7);
        List<Integer> result = levelOrder(node);
        System.out.println("递归结果：" + result);
        result = dfsTree(node);
        System.out.println("非递归结果：" + result);

    }

    static List<Integer> list = new ArrayList<>();

    // 递归写法
    public static List<Integer> levelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        list.add(root.val);
        levelOrder(root.left);
        levelOrder(root.right);
        return list;
    }

    // 非递归写法
    public static List<Integer> dfsTree(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        if (node == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode node1 = stack.pop();
            if (node1.right != null)
                stack.push(node1.right);
            if (node1.left != null)
                stack.push(node1.left);
            list.add(node1.val);
        }
        return list;
    }
}
