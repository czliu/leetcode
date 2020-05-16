// 0210. course schedule II
// #medium #graph #topologicalSort
// **

package _0210;
import java.util.*;

public class Solution {

    // 方法 1 最简单的 BFS
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0)
            return new int[0];
        int[] inDegrees = new int[numCourses];
        // 建立入度表
        for (int[] p : prerequisites) {
            inDegrees[p[0]]++;
        }
        // 入度为0的节点队列
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegrees.length; i++) {
            if (inDegrees[i] == 0)
                queue.offer(i);
        }
        int count = 0; // 记录可以学完的课程数量
        int[] res = new int[numCourses]; // 可以学完的课程
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            res[count++] = curr;
            for (int[] p : prerequisites) {
                if (p[1] == curr) {
                    inDegrees[p[0]]--;
                    if (inDegrees[p[0]] == 0)
                        queue.offer(p[0]);
                }
            }
        }
        if (count == numCourses)
            return res;
        return new int[0];
    }

}