// 0102. binary tree level order traversal
// #medium #binarytree
// -

package _0102;

import structure.TreeNode;
import java.util.*;

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

    List<List<Integer>> ans;

    public List<List<Integer>> levelOrder(TreeNode root) {
        ans = new ArrayList<>();
        int level = 0;
        traverse(root, level);
        return ans;
    }

    private void traverse(TreeNode node, int level) {
        if (node == null) return;
        else if (level > ans.size()-1) {
            List<Integer> cur = new ArrayList<>();
            cur.add(node.val);
            ans.add(cur);
        } else {
            ans.get(level).add(node.val);
        }
        traverse(node.left, level + 1);
        traverse(node.right, level + 1);
    }
}