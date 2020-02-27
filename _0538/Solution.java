// 0538. Convert BST to Greater Tree
// BST 二叉搜索树

package _0538;

// import java.util.*;

import structure.TreeNode;

class Solution {

    int pre = 0;

    public TreeNode convertBST(TreeNode root) {
        reverseInOrder(root);
        return root;
    }

    private void reverseInOrder(TreeNode node) {
        if (node == null) return;
        reverseInOrder(node.right);
        node.val += pre;
        pre = node.val;
        reverseInOrder(node.left);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[5,2,13]");
        TreeNode result1 = s.convertBST(root1);
        TreeNode.printInOrder(result1);
    }
}
