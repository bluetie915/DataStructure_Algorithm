package com.yicheng.leetcode.tree.no145;

import com.yicheng.node.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的 后序 遍历。
 *
 * @author 张艺成
 * @date 2020/9/30 0030 9:18
 */
public class Result1 {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(9);
        node.right.right = new TreeNode(4);
        node.right.right.left = new TreeNode(7);
        List<Integer> list = postorderTraversal(node);
        System.out.println(list);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
            return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
}
