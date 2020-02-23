// 0110. balanced Binary Tree
// balanced BST

package _0110;

// import java.util.*;

import structure.TreeNode;

// // Top-down approach, Time complexity: O(n logn)
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if (root == null) return true;
//         return Math.abs(height(root.left) - height(root.right)) <= 1
//             && isBalanced(root.left)
//             && isBalanced(root.right);
//     }

//     private int height(TreeNode node) {
//         if (node == null) return 0;
//         return 1 + Math.max(height(node.left), height(node.right));
//     }

//     public static void main(String[] args) {
//         Solution s = new Solution();
//         TreeNode root1 = TreeNode.createTree("[3,9,20,null,null,15,7]");
//         boolean result1 = s.isBalanced(root1);
//         System.out.println(result1);
//         TreeNode root2 = TreeNode.createTree("[1,2,2,3,3,null,null,4,4]");
//         boolean result2 = s.isBalanced(root2);
//         System.out.println(result2);
//     }
// }

// bottom up approach, Time complexity: O(n)
class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        if(left == -1) return -1;
        int right = height(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[3,9,20,null,null,15,7]");
        boolean result1 = s.isBalanced(root1);
        System.out.println(result1);
        TreeNode root2 = TreeNode.createTree("[1,2,2,3,3,null,null,4,4]");
        boolean result2 = s.isBalanced(root2);
        System.out.println(result2);
    }
}
