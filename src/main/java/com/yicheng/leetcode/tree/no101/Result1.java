package com.yicheng.leetcode.tree.no101;

import com.yicheng.node.TreeNode;

/**
 * @author 张艺成
 * @date 2020/9/30 0030 10:00
 */
public class Result1 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(5);
        node.left.left = new TreeNode(1);
        node.right.right = new TreeNode(1);
        System.out.println(isSymmetric(node));
    }

    public static boolean isSymmetric(TreeNode root) {
        return isSameTree(root, root);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return p == q;
        return p.val == q.val && isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }
}
