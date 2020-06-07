// 933. 最近的请求次数
// #easy
// -

package _0933;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> q = new LinkedList<>();

    public RecentCounter() {
    }

    public int ping(int t) {
        q.add(t);
        while (!q.isEmpty() && q.peek() < t - 3000) q.poll();
        return q.size();
    }
}

/*
  Your RecentCounter object will be instantiated and called as such:
  RecentCounter obj = new RecentCounter();
  int param_1 = obj.ping(t);
 */