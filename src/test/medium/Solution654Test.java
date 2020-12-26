package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution654Test {

  @Test
  public void constructMaximumBinaryTree() {
    TreeNode treeNode = new Solution654()
      .constructMaximumBinaryTree(
        new int[]{3, 2, 1, 6, 0, 5});
    assertEquals(6, treeNode.val);
    assertEquals(3, treeNode.left.val);
    assertEquals(2, treeNode.left.right.val);
    assertEquals(1, treeNode.left.right.right.val);
    assertEquals(5, treeNode.right.val);
    assertEquals(0, treeNode.right.left.val);
  }
}