// 0114. Flatten binary tree to linked list
// #medium #binarytree
// -

package _0114;

import structure.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        // in-place
        if (root == null) return;
        else if (root.left == null && root.right == null) return;
        else if (root.left == null) flatten(root.right);
        else if (root.right == null) {
            root.right = root.left;
            root.left = null;
            flatten(root.right);
        }
        else { // root.left != null && root.right != null
            TreeNode tmp = root.left;
            while (tmp.right != null) tmp = tmp.right;
            tmp.right = root.right;
            root.right = root.left;
            root.left = null;
            flatten(root.right);
        }
        return;
    }
}