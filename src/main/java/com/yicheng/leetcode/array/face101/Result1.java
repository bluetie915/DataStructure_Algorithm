package com.yicheng.leetcode.array.face101;

/**
 * @author 张艺成
 * @date 2020/9/20 0020 15:12
 */

import java.util.Arrays;

/**
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 * <p>
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sorted-merge-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Result1 {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] B = {2, 5, 6};
        int n = 3;
        merge(A, m, B, n);
    }

    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;
        int j = n - 1;
        int idx = m + n - 1;
        // 如果两个数组长度都大于0
        while (i >= 0 && j >= 0) {
            if (B[j] >= A[i]) {
                A[idx--] = B[j--];
            } else {
                A[idx--] = A[i--];
            }
        }
        // 如果数组1的长度等于0，数组2的长度大于0
        while (j >= 0) {
            A[idx--] = B[j--];
        }
        System.out.println(Arrays.toString(A));
    }
}
