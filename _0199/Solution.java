// 0199. Binary tree right side view

// binary tree

package _0199;

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

    HashMap<Integer, Integer> map = new HashMap<>();

    public List<Integer> rightSideView(TreeNode root) {
        preOrder(root, 0);
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<map.size();++i) ans.add(i, map.get(i));
        return ans;
    }

    private void preOrder(TreeNode node, int depth){
        if (node == null) return;
        map.put(depth, node.val);
        preOrder(node.left, depth+1);
        preOrder(node.right, depth+1);
    }
}