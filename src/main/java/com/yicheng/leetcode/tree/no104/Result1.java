package com.yicheng.leetcode.tree.no104;

import com.yicheng.node.TreeNode;

/**
 * @author 张艺成
 * @date 2020/9/30 0030 10:06
 */
public class Result1 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(9);
        node.right.right = new TreeNode(4);
        node.right.right.left = new TreeNode(7);
        System.out.println(maxDepth(node));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}


