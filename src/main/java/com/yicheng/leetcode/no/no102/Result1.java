package com.yicheng.leetcode.no.no102;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个二叉树，请你返回其按层序遍历得到的节点值。 （即逐层地，从左到右访问所有节点）。
 */

public class Result1 {

    public static void main(String[] args) {
        Result1 result1 = new Result1();
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
