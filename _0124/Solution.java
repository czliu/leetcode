// 124. 二叉树中的最大路径和
// #hard
// -

package _0124;

import structure.TreeNode;

import java.util.Arrays;

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
    public int maxPathSum(TreeNode root) {
        int[] ans = helper(root);
        return ans[1];
    }

    private int[] helper(TreeNode node) {
        // ans[0] largest sum from node to any other
        // ans[1] largest sum containing node, node.left, or node.right
        int[] ans = new int[2];
        if (node == null) return null;
        if (node.left != null && node.right != null) {
            int[] left = helper(node.left);
            int[] right = helper(node.right);
            ans[0] = Math.max(node.val + Math.max(left[0], right[0]), node.val);
            int[] tmp = new int[6];
            tmp[0] = left[0];
            tmp[1] = node.val;
            tmp[2] = right[0];
            tmp[3] = left[0] + node.val;
            tmp[4] = left[0] + node.val + right[0];
            tmp[5] = node.val + right[0];
            Arrays.sort(tmp);
            ans[1] = Math.max(Math.max(left[1], right[1]), tmp[5]);
        }
        else if (node.left != null || node.right != null) {
            int[] k = new int[2];
            if (node.left != null) k = helper(node.left);
            else if (node.right != null) k = helper(node.right);
            ans[0] = Math.max(node.val + k[0], node.val);
            int[] tmp = new int[3];
            tmp[0] = k[0];
            tmp[1] = tmp[0] + node.val;
            tmp[2] = tmp[1] - k[0];
            Arrays.sort(tmp);
            ans[1] = Math.max(k[1], tmp[2]);
        }
        else {
            ans[0] = node.val;
            ans[1] = node.val;
        }

        return ans;
    }
}

class Solution1 {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    public int maxGain(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // 递归计算左右子节点的最大贡献值
        // 只有在最大贡献值大于 0 时，才会选取对应子节点
        int leftGain = Math.max(maxGain(node.left), 0);
        int rightGain = Math.max(maxGain(node.right), 0);

        // 节点的最大路径和取决于该节点的值与该节点的左右子节点的最大贡献值
        int priceNewpath = node.val + leftGain + rightGain;

        // 更新答案
        maxSum = Math.max(maxSum, priceNewpath);

        // 返回节点的最大贡献值
        return node.val + Math.max(leftGain, rightGain);
    }
}
