// 0107. Binary Tree Level Order Traversal II
// depth first search

package _0107;

import java.util.*;

import structure.TreeNode;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        dfs(root, 0, list);
        Collections.reverse(list);
        return list;
    }
    
    private void dfs(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) return;
        if (list.size() <= level) list.add(level, new ArrayList<Integer>());
        list.get(level).add(root.val);
        dfs(root.left, level+1, list);
        dfs(root.right, level+1, list);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> result1 = s.levelOrderBottom(
            TreeNode.createTree("[3,9,20,null,null,15,7]")
        );
        System.out.println(result1);
    }
}