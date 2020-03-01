// 0589. N-ary Tree Preorder Traversal
// N-ary Tree, iterative 迭代

package _0589;

import java.util.*;

import structure.Node;

class Solution {

    public List<Integer> preorder(Node root) {
        LinkedList<Node> nodeStack = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;
        nodeStack.add(root);
        while (!nodeStack.isEmpty()) {
            Node node = nodeStack.pollLast();
            result.add(node.val);
            Collections.reverse(node.children);
            for (Node item : node.children) {
                nodeStack.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
