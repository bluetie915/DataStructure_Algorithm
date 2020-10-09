package com.yicheng.leetcode.tree.no404;

import com.yicheng.leetcode.tree.node.TreeNode;

/**
 * 计算给定二叉树的所有左叶子之和。
 *
 * @author 张艺成
 * @date 2020/9/30 0030 10:50
 */
public class Result1 {
    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return  0;
        if (root.left != null && root.right != null)
            return root.left.val + sumOfLeftLeaves(root.right);
        if (root.left == null)
            return 0;
        return root.left.val;
    }
}
