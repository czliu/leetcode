// 0687. 最长同值路径
// #easy
// -

package _0687;

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

    int ans = 0;

    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return ans;
    }

    private int[] helper(TreeNode node) {
        int[] res = new int[] {0,0};
        if (node == null) return res;
        int[] left = helper(node.left);
        if (node.left != null && node.val == node.left.val) {
            res[0] = Math.max(left[0], left[1]) + 1;
        }
        int[] right = helper(node.right);
        if (node.right != null && node.val == node.right.val) {
            res[1] = Math.max(right[0], right[1]) + 1;
        }
        ans = Math.max(ans, res[0] + res[1]);
        return res;
    }
}