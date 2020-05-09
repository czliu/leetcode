// 0236. lowest common ancestor of a binary tree
// *
// #medium #binarytree

package _0236;

import java.util.*;
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

    Map<Integer, TreeNode> parent = new HashMap<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        Set<Integer> parentsP = new HashSet<>();
        while (p != null) {
            parentsP.add(p.val);
            p = parent.get(p.val);
        }
        while (q != null) {
            if (parentsP.contains(q.val)) return q;
            q = parent.get(q.val);
        }
        return null;
    }
    
    private void dfs(TreeNode node) {
        if (node.left != null) {
            parent.put(node.left.val, node);
            dfs(node.left);
        }
        if (node.right != null) {
            parent.put(node.right.val, node);
            dfs(node.right);
        }
    }
}