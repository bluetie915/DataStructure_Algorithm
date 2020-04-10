package com.yicheng.leetcode.no2;

public class Result1 {

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        s1.append(l1.val);
        s2.append(l2.val);
        while (l1.next != null)
            s1.append(l1.next.val);
        while (l2.next != null)
            s2.append(l2.next.val);
        System.out.println(s1);
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
