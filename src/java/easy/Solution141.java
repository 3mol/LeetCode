package easy;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Hu yujing
 * Date: 2019/9/30
 * Time: 14:29
 * Describe：
 */
public class Solution141 {
    /*给定一个链表，判断链表中是否有环。

    为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/linked-list-cycle
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode1;
        boolean b = new Solution141().hasCycle(listNode1);
        System.out.println(b);
    }

    public boolean hasCycle(ListNode head) {
        if (null == head) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        ListNode node = head;
        while (null != node){
            //System.out.println(node.val);
            Integer i = node.hashCode();
            boolean added = set.add(i);
            if (!added) {
                // 已经包含了
                return true;
            } else {
                // 未包含
                node = node.next;
            }
        }
        // System.out.println(set);
        return false;
    }
}