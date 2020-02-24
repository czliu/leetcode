// 0226. Invert Binary Tree
// BST

package _0226;

// import java.util.*;

import structure.TreeNode;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        else if (root.left == null && root.right == null) return root;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[3,9,20,null,null,15,7]");
        TreeNode result1 = s.invertTree(root1);
        TreeNode.printInOrder(result1);
    }
}
