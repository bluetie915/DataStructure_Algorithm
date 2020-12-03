package com.yicheng.leetcode.tree.no257;

import com.yicheng.node.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张艺成
 * @date 2020/11/12 0012 19:01
 */
//给定一个二叉树，返回所有从根节点到叶子节点的路径。
public class Result {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(6);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(9);
        node.left.right = new TreeNode(2);
        List<String> list = binaryTreePaths(node);
        System.out.println(list);
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        constructPaths(root, "", paths);
        return paths;
    }

    public static void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(Integer.toString(root.val));
            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
                paths.add(pathSB.toString());  // 把路径加入到答案中
            } else {
                pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
                constructPaths(root.left, pathSB.toString(), paths);
                constructPaths(root.right, pathSB.toString(), paths);
            }
        }
    }
}
