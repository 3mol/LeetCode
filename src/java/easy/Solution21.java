package easy;

/**
 * Created by 胡宇靖 on 2019/3/31.
 */
public class Solution21 {
    // 执行用时 : 2 ms, 在Merge Two Sorted Lists的Java提交中击败了100.00% 的用户
    // 内存消耗 : 36.9 MB, 在Merge Two Sorted Lists的Java提交中击败了0.97% 的用户
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 != null && l2 == null) return l1;
        if (l1 == null) return l2;

        ListNode head = null;
        ListNode p = null;
        while (l1 != null && l2 != null) {
            // 存放最小值
            Integer temp;
            if (l1.val <= l2.val) {
                temp = l1.val;
                l1 = l1.next;
            } else {
                temp = l2.val;
                l2 = l2.next;
            }
            ListNode x = new ListNode(temp);
            if (head == null) {
                head = x;
                p = head;
            } else {
                p.next = x;
                p = p.next;
            }
        }
        // 处理某一链为null的情况;
        if (l1 != null) {
            // 把l1移动到p后面.
            while (l1 != null) {
                p.next = new ListNode(l1.val);
                p = p.next;
                l1 = l1.next;
            }
        } else {
            // 把l2移动到p后面.
            while (l2 != null) {
                p.next = new ListNode(l2.val);
                p = p.next;
                l2 = l2.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        new Solution21().mergeTwoLists(listNode1, listNode4);
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}