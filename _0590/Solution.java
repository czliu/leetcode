// 0590. N-ary Tree Postorder Traversal
// N-ary Tree, iterative 迭代

package _0590;

import java.util.*;

import structure.Node;

class Solution {

    public List<Integer> postorder(Node root) {
        LinkedList<Node> nodeStack = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;
        nodeStack.add(root);
        while (!nodeStack.isEmpty()) {
            Node node = nodeStack.pollLast();
            result.add(node.val);
            for (Node item : node.children) {
                nodeStack.add(item);
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
    }
}
