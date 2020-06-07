// 897. 递增顺序查找树
// #easy
// -

package _0897;

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
    
    TreeNode dummyRoot = new TreeNode(0);
    TreeNode pre = new TreeNode(0);

    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return dummyRoot.right;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (dummyRoot.right == null) {
            dummyRoot.right = new TreeNode(node.val);
            pre = dummyRoot.right;
        } else {
            pre.right = new TreeNode(node.val);
            pre = pre.right;
        }
        inorder(node.right);
    }
}