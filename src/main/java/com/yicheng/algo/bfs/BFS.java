package com.yicheng.algo.bfs;

import com.yicheng.node.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 张艺成
 * @date 2020/10/21 0021 17:56
 */
public class BFS {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(9);
        node.right.right = new TreeNode(4);
        node.right.right.left = new TreeNode(7);
        List<Integer> result = treeBFS(node);
        System.out.println("BFS结果：" + result);
    }

    public static List<Integer> treeBFS(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        if (node == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            if (node1.left != null)
                queue.offer(node1.left);
            if (node1.right != null)
                queue.offer(node1.right);
            list.add(node1.val);
        }
        return list;
    }
}
