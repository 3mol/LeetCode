package medium;

class TreeNode {
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
}

public class Solution654 {
  /**
   * 执行用时：
   * 4 ms , 在所有 Java 提交中击败了
   * 15.44% 的用户
   * 内存消耗： 38.4 MB , 在所有 Java 提交中击败了 89.84% 的用户
   * @param nums
   * @return
   */
  public TreeNode constructMaximumBinaryTree(int[] nums) {
    if (null == nums || nums.length == 0) {
      return null;
    }
    TreeNode root = new TreeNode(nums[0]);
    for (int i = 1; i < nums.length; i++) {
      root = construct(root, nums[i]);
    }
    return root;
  }

  private TreeNode construct(TreeNode root, int num) {
    if (root.val > num) {
      // 右子树为空, 直接建立一个新的节点放到
      if (null == root.right) {
        root.right = new TreeNode(num);
        return root;
      }
      // 右子树不为空, 根据右子树的结构重新构造一个新的最大二叉树
      root.right = construct(root.right, num);
      return root;
    }
    // 根节点的值比num小, 创建新的节点作为最大根节点
    TreeNode newRoot = new TreeNode(num);
    newRoot.left = root;
    return newRoot;
  }
}
