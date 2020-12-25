package medium;


import org.junit.Test;

import static org.junit.Assert.*;

public class Solution116Test {
  /**
   * 执行用时： 0 ms,在所有 Java 提交中击败了 100.00% 的用户
   * 内存消耗：
   * 38.7 MB
   * , 在所有 Java 提交中击败了
   * 61.67%
   * 的用户
   */
  @Test
  public void test01() {
    Solution116.Node node1, node2, node3, node4, node5, node6, node7;
    node1 = new Solution116.Node(1);
    node2 = new Solution116.Node(2);
    node3 = new Solution116.Node(3);
    node4 = new Solution116.Node(4);
    node5 = new Solution116.Node(5);
    node6 = new Solution116.Node(6);
    node7 = new Solution116.Node(7);
    node1.left = node2;
    node1.right = node3;

    node2.left = node4;
    node2.right = node5;

    node3.left = node6;
    node3.right = node7;
    Solution116.Node result = new Solution116().connect(node1);

    assertEquals(node1, result);

    assertNull(node1.next);
    assertNull(node3.next);
    assertNull(node7.next);

    assertEquals(node3, node2.next);
    assertEquals(node5, node4.next);
    assertEquals(node6, node5.next);
    assertEquals(node7, node6.next);
  }
}