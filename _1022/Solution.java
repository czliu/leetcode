// 1022. 从根到叶的二进制数之和
// #easy
// *

package _1022;

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
    int mod = 1000000007;
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    int dfs(TreeNode root, int val) {
        if (root == null) return 0;
        val = (val * 2 + root.val) % mod;
        if (root.right == root.left) return val;
        return (dfs(root.left, val) + dfs(root.right, val) % mod);
    }
}

