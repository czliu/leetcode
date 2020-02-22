// 0100. Same Tree

package _0100;

import structure.TreeNode;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p == null || q == null || p.val != q.val) return false;
        else if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result1 = s.isSameTree(
            TreeNode.createTree("[1,2,3]"),
            TreeNode.createTree("[1,2,3]")
        );
        System.out.println(result1);
        boolean result2 = s.isSameTree(
            TreeNode.createTree("[1,2,null]"),
            TreeNode.createTree("[1,null,2]")
        );
        System.out.println(result2);
    }
}