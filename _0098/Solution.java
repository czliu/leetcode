// 0098. validate binary search tree
// *
// #medium #BST

package _0098;

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

public class Solution {

    boolean isMinVal = true;
    int pre;

    public boolean isValidBST(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode node){
        if (node == null) return true;
        if (isMinVal == true && node.left == null) {
            pre = node.val;
            isMinVal = false;
        }
        if (!dfs(node.left)) return false;
        if (node.val <= pre) return false;
        pre = node.val;
        if (!dfs(node.right)) return false;
        return true;
    }
}