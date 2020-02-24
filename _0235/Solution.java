// 0235. Lowest Common Ancestor of a Binary Search Tree
// BST 二叉搜索树， Recursion 递归

package _0235;

// import java.util.*;

import structure.TreeNode;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        else if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        else return root;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[6,2,8,0,4,7,9,null,null,3,5]");
        TreeNode result1 = s.lowestCommonAncestor(root1, new TreeNode(2), new TreeNode(8));
        System.out.println(result1.val);
    }
}
