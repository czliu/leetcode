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

    public boolean check(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return check(root.left, minVal, root.val) && check(root.right, root.val, maxVal);
    }
        
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}