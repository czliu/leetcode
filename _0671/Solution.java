// 0671. 二叉树中第二小的节点
// #easy
// -

package _0671;

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

    int min1 = -1, min2 = -1;

    public int findSecondMinimumValue(TreeNode root) {
        search(root);
        return min2;
    }

    private void search(TreeNode node) {
        if (node == null) return;
        if (min2 > 0 && node.val < min2) {
            if (node.val > min1) min2 = node.val;
            else if (node.val < min1) {
                min2 = min1;
                min1 = node.val;
            }
            search(node.left);
            search(node.right);
        }
        else if (min2 == -1) {
            if (min1 == -1) min1 = node.val;
            else if (node.val < min1) {
                min2 = min1;
                min1 = node.val;
            }
            else if (node.val > min1) min2 = node.val;
            search(node.left);
            search(node.right);
        }
        else return;
    }
}