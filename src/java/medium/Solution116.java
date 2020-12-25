package medium;

/**
 * 给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 * <p>
 * struct Node {
 * int val;
 * Node *left;
 * Node *right;
 * Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * <p>
 * 初始状态下，所有 next 指针都被设置为 NULL。
 *
 * @author Hu yujing
 */
public class Solution116 {
  public Node connect(Node root) {
    if (root == null) {
      return null;
    }
    if (null == root.left && null == root.right) {
      return root;
    }

    assert root.left != null;
    assert root.right != null;

    // 根节点的左节点直接指向右节点
    root.left.next = root.right;
    // 让两棵树的结点相连
    if (null != root.next) {
      root.right.next = root.next.left;
    }
    connect(root.left);
    connect(root.right);
    return root;
  }

  static class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
      val = _val;
      left = _left;
      right = _right;
      next = _next;
    }

    @Override
    public String toString() {
      return "Node{" +
        "val=" + val + '}';
    }
  }

  ;
}

