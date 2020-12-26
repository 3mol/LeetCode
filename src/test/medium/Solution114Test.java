package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution114Test {

  @Test
  public void flatten() {
    Solution114.TreeNode node1, node2, node3, node4, node5, node6;
    node1 = new Solution114.TreeNode(1);
    node2 = new Solution114.TreeNode(2);
    node3 = new Solution114.TreeNode(3);
    node4 = new Solution114.TreeNode(4);
    node5 = new Solution114.TreeNode(5);
    node6 = new Solution114.TreeNode(6);

    node1.left = node2;
    node1.right = node5;
    node2.left = node3;
    node2.right = node4;
    node5.right = node6;
    new Solution114().flatten(node1);
    assertEquals(node2, node1.right);
    assertEquals(node3, node2.right);
    assertEquals(node4, node3.right);
    assertEquals(node5, node4.right);
    assertEquals(node6, node5.right);
    assertNull(node1.left);
    assertNull(node2.left);
    assertNull(node3.left);
    assertNull(node4.left);
    assertNull(node5.left);
    assertNull(node6.left);
    print(node1);
  }

  private void print(Solution114.TreeNode node1) {
    if (null == node1) {
      return;
    }
    System.out.println(node1);
    print(node1.left);
    print(node1.right);
  }
}