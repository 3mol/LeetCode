package com.company.hyj.medium;

/**
 * Created by 胡宇靖 on 2019/3/27.
 */
public class Solution02 {
    /*输入：(2 -> 4 -> 3)
            + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807

    输入：(2 -> 4 -> 3 -> 3)
            + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8 -> 3
    原因：3342 + 465 = 3807*/

    // 执行用时 : 52 ms, 在Add Two Numbers的Java提交中击败了69.64% 的用户
    // 内存消耗 : 61 MB, 在Add Two Numbers的Java提交中击败了0.95% 的用户
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
        * 特点:
        * 如果相加超过 10 ,需要向后继 +1 (因为位置进制逆序)
        * 和归并排序中 合并两个数组相似,是否可以利用某一个L为空时候,把另一个链的数据直接加carry位置? #MARK
        * */
        ListNode result = null;
        ListNode p = null;
        boolean needPlus = false;
        while (l1 != null || l2 != null || needPlus) {

            int i = 0;

            // 对 L1/L2 为空做想应的处理
            if (l1 != null && l2 != null) {
                i = l1.val + l2.val;
            } else if (l1 == null && l2 != null) {
                i = l2.val;
            } else if (l1 != null) {
                i = l1.val;
            }

            // 设置下一个位置进一位
            if (needPlus) {
                i++;
            }

            // 把计算结果插入到链表中
            if (null == result) {
                result = new ListNode(i % 10);
                p = result;
            } else {
                //  !!! 注意链表的插入方式
                p.next = new ListNode(i % 10);
                p = p.next;
            }

            // 如果 i >= 10 就需要设置一个进位标识
            needPlus = i >= 10;

            // 处理 L1/L2 为空的问题 (null.next) 的问题
            if (l1 != null && l2 != null) {
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null && l2 != null) {
                l2 = l2.next;
            } else if (l1 != null) {
                l1 = l1.next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(4);
        ListNode listNode = new Solution02().addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}