// 872. 叶子相似的树
// #easy
// -

package _0872;

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        LinkedList<Integer> list1 = leaf(root1);
        LinkedList<Integer> list2 = leaf(root2);
        if (list1.size() != list2.size()) return false;
        while (!list1.isEmpty()) {
            if (list1.poll() != list2.poll()) return false;
        }
        return true;
    }

    private LinkedList<Integer> leaf(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        inorder(root, list);
        return list;
    }

    private void inorder(TreeNode node, LinkedList<Integer> list) {
        if (node == null) return;
        inorder(node.left, list);
        if (node.left == null && node.right == null) list.add(node.val);
        inorder(node.right, list);
    }
}