// 0703.数据流中的第K大元素
// #easy
// *

package _0703;

import java.util.*;

public class KthLargest {

    int size;
    private PriorityQueue<Integer> q;

    public KthLargest(int k, int[] nums) {
        size = k;
        q = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (q.size() < size) {
            q.add(val);
        } else if (q.peek() < val) {
            q.poll();
            q.add(val);
        }
        return q.peek();
    }
}