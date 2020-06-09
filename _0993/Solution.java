// 993. 二叉树的堂兄弟节点
// #easy
// -

package _0993;

import structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

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

    Map<Integer, int[]> map = new HashMap<>();

    public boolean isCousins(TreeNode root, int x, int y) {
        inorder(root, new int[] {0, 0});
        int[] ax = map.get(x);
        int[] ay = map.get(y);
        return (ax[0] == ay[0]) && (ax[1] != ay[1]);
    }

    private void inorder(TreeNode node, int[] a) {
        if (node == null) return;
        inorder(node.left, new int[] {a[0] + 1, node.val});
        map.put(node.val, new int[] {a[0], a[1]});
        inorder(node.right, new int[] {a[0] + 1, node.val});
    }
}