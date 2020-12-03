package com.yicheng.leetcode.tree.no100;

import com.yicheng.node.TreeNode;

/**
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * <p>
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * @author 张艺成
 * @date 2020/9/30 0030 9:45
 */
public class Result1 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        node1.left = new TreeNode(5);
        node1.right = new TreeNode(8);
        node1.left.left = new TreeNode(1);
        node1.left.right = new TreeNode(9);
        node1.right.right = new TreeNode(4);
        node1.right.right.left = new TreeNode(7);

        TreeNode node2 = new TreeNode(3);
        node2.left = new TreeNode(5);
        node2.right = new TreeNode(8);
        node2.left.left = new TreeNode(1);
        node2.left.right = new TreeNode(9);
        node2.right.right = new TreeNode(4);
        node2.right.right.left = new TreeNode(7);
        System.out.println(isSameTree(node1, node2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return p == q;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
