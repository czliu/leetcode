// 0559. Maximum Depth of N-ary Tree
// N-ary Tree

package _0559;

import java.util.*;

import structure.Node;

class Solution {

    public int maxDepth(Node root) {
        List<Integer> depth = new LinkedList<>();
        if (root == null) return 0;
        else if (root.children.isEmpty()) return 1;
        else {
            for (Node item : root.children) depth.add(maxDepth(item));
        }
        return Collections.max(depth) + 1;
    }

    public static void main(String[] args) {
    }
}
