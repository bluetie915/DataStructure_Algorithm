package com.yicheng.algo.dfs;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    public static void main(String[] args) {

        DFS result1 = new DFS();
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(9);
        node.right.right = new TreeNode(4);
        node.right.right.left = new TreeNode(7);
        List<Integer> result = result1.levelOrder(node);
        System.out.println(result);
    }
    List<Integer> list = new ArrayList<>();

    public List<Integer> levelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        list.add(root.val);
        levelOrder(root.left);
        levelOrder(root.right);
        return list;
    }
}
