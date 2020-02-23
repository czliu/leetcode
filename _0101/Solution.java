// 0101. Symmetric Tree

package _0101;

import structure.TreeNode;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        else return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p == null || q == null || p.val != q.val) return false;
        else return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result1 = s.isSymmetric(
            TreeNode.createTree("[1,2,2,3,4,4,3]")
        );
        System.out.println(result1);
        boolean result2 = s.isSymmetric(
            TreeNode.createTree("[1,2,2,null,3,null,3]")
        );
        System.out.println(result2);
        boolean result3 = s.isSymmetric(
            TreeNode.createTree("[1,2,3]")
        );
        System.out.println(result3);
    }
}