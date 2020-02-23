// 0108. Convert Sorted Array to Binary Search Tree
// Balanced BST

package _0108;

//import java.util.*;

import structure.TreeNode;

class Solution {
    int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length-1);
    }

    private TreeNode helper(int left, int right) {
        if (left > right) return null;
        // always choose left middle node as a root
        // if (right-left) is odd, then mid is the middle node index
        // if (right-left) is even, then mid is the left middle node index
        int mid = (left + right) / 2;
        // inorder traversal: left -> node -> right
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(left, mid-1);
        root.right = helper(mid+1, right);
        return root;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-10,-3,0,5,9};
        TreeNode result1 = s.sortedArrayToBST(nums);
        TreeNode.printInOrder(result1);
    }
}