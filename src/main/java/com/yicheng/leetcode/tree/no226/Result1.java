package com.yicheng.leetcode.tree.no226;

import com.yicheng.node.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 翻转一棵二叉树。
 *
 * @author 张艺成
 * @date 2020/10/11 0011 9:53
 */
public class Result1 {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(9);
        node.right.right = new TreeNode(4);
        node.right.right.left = new TreeNode(7);
        System.out.println("翻转之前的dfs：" + levelOrder(node));
        list.removeAll(list);
        TreeNode result = invertTree(node);
        System.out.println("翻转之后的dfs：" + levelOrder(result));
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static List<Integer> levelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        list.add(root.val);
        levelOrder(root.left);
        levelOrder(root.right);
        return list;
    }
}
