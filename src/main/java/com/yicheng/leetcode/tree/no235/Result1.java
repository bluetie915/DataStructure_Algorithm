package com.yicheng.leetcode.tree.no235;

import com.yicheng.node.TreeNode;
import com.yicheng.util.ArrayToTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张艺成
 * @date 2020/12/4 0004 20:22
 */
public class Result1 {

    public static void main(String[] args) {
        int[] param = {-10, -3, 0, 5, 9, 2, 6, -4, 7, 22};
        TreeNode node = ArrayToTree.sortedArrayToBST(param);
        TreeNode result = lowestCommonAncestor(node, node.left, node.left.right);
        System.out.println(result.val);
    }

    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pPath = getPath(root, p);
        List<TreeNode> qPath = getPath(root, q);
        TreeNode ancestor = null;
        for (int i = 0; i < pPath.size() && i < qPath.size(); i++) {
            if (pPath.get(i) == qPath.get(i))
                ancestor = pPath.get(i);
            else
                break;
        }
        return ancestor;
    }

    static List<TreeNode> getPath(TreeNode root, TreeNode target) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        while (root != target) {
            list.add(root);
            if (target.val < root.val)
                root = root.left;
            else
                root = root.right;
        }
        list.add(root);
        return list;
    }
}
