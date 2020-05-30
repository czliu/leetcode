// 783. 二叉搜索树节点最小距离
// #easy
// *
// same as 0530

package _0783;

import structure.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int pre = -1; // This BST only has non-negative values
    int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        if (root == null) return -1; // There are at least two nodes in this BST, so this won't happen
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        if (pre == -1) pre = node.val;
        else {
            int cur = Math.abs(pre - node.val); // current absolute difference
            if (cur < min) min = cur;
            pre = node.val;
        }
        inOrder(node.right);
    }

}