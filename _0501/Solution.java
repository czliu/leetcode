// 0501. Find Mode in Binary Search Tree
// BST 二叉搜索树, DFS, 时间复杂度O(n), 空间复杂度O(1)

package _0501;

import java.util.*;

import structure.TreeNode;

class Solution {

    private List<Integer> list;
    private int pre; 
    private int cur = 0; //current count
    private int max = 0; //max count

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        list = new LinkedList<>();
        inOrder(root);
        int[] result = new int[list.size()];
        for (int i=0; i<=list.size()-1; i++) {
            result[i] = list.get(i);
        } 
        return result;
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        if(pre == node.val) cur++;
        else {
            cur = 1;
            pre = node.val;
        }
        if(cur == max) list.add(node.val);
        else if (cur > max) {
            list.clear();
            list.add(node.val);
            max = cur;
        }
        inOrder(node.right);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[1,null,2,null,null,2]");
        int[] result1 = s.findMode(root1);
        for (int i : result1) System.out.println(i);
    }
}
