// 938. 二叉搜索树的范围和
// #easy
// -

package _0938;

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

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        preorder(root, L, R);
        return sum;
    }

    private void preorder(TreeNode node, int L, int R) {
        if (node == null) return;
        if (node.val >= L && node.val <= R) {
            sum += node.val;
            preorder(node.left, L, R);
            preorder(node.right, L, R);
        } else if (node.val < L) preorder(node.right, L, R);
        else preorder(node.left, L, R);
    }
}
