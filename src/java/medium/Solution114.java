package medium;

public class Solution114 {
  //给定一个二叉树，原地将它展开为一个单链表。

// 例如，给定二叉树
//
//     1
//   / \
//  2   5
// / \   \
//3   4   6
//
// 将其展开为：
//
// 1
// \
//  2
//   \
//    3
//     \
//      4
//       \
//        5
//         \
//          6
// Related Topics 树 深度优先搜索

  public void flatten(TreeNode root) {
    f(root);
  }

  private TreeNode f(TreeNode root) {
    if (null == root) {
      return null;
    }
    TreeNode r = f(root.right);
    TreeNode l = f(root.left);
    if (null != l) {
      root.right = l;
      addToLast(l, r);
      root.left = null;
    }
    return root;
  }

  private void addToLast(TreeNode node, TreeNode target) {
    if (null == node.right) {
      node.right = target;
      return;
    }
    addToLast(node.right, target);
  }

  // Definition for a binary tree node.
  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    @Override
    public String toString() {
      return "TreeNode{" +
        "val=" + val +
        '}';
    }
  }
}
