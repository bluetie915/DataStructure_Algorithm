package com.yicheng.leetcode.no867;

/**
 * @author 张艺成
 * @date 2020/9/20 0020 11:44
 */

import java.util.Arrays;

/**
 * 给定一个矩阵 A， 返回 A 的转置矩阵
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * <p>
 * 输入：[[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[1,4,7],[2,5,8],[3,6,9]]
 */
public class Result1 {
    public static void main(String[] args) {
        int[][] input = {{2, 4}, {1, 3}};
        int[][] result = transpose(input);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] transpose(int[][] A) {
        int width = A.length;
        int height = A[0].length;
        int[][] newArray = new int[height][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                newArray[j][i] = A[i][j];
            }
        }
        return newArray;
    }
}
