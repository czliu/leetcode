// interview59_ii. 队列的最大值
// 特别注意两个不同list之间get比较数值不能用MaxQueue.getFirst() == SortQueue.getFirst()

package interview59_ii;

import java.util.*;

class Solution {
    public static void main (String[] args) {
        MaxQueue q = new MaxQueue();
        q.push_back(868);
        System.out.println(q.pop_front());
        System.out.println(q.pop_front());
        System.out.println(q.pop_front());
        q.push_back(525);
        System.out.println(q.pop_front());
        System.out.println(q.max_value());
        System.out.println(q.pop_front());
    } 
}

class MaxQueue {
    
    LinkedList<Integer> MaxQueue;
    LinkedList<Integer> SortQueue;

    public MaxQueue() {
        MaxQueue = new LinkedList<>();
        SortQueue = new LinkedList<>();
    }
    
    public int max_value() {
        if (SortQueue.isEmpty()) return -1;
        return SortQueue.getFirst();
    }
    
    public void push_back(int value) {
        MaxQueue.addLast(value);
        while (!SortQueue.isEmpty() && SortQueue.getLast() < value) SortQueue.removeLast();
        SortQueue.addLast(value);
    }
    
    public int pop_front() {
        if (MaxQueue.isEmpty()) return -1;
        // else if (MaxQueue.getFirst() == SortQueue.getFirst()) SortQueue.removeFirst();
        else if (MaxQueue.getFirst().equals(SortQueue.getFirst())) SortQueue.removeFirst();
        return MaxQueue.removeFirst();
    }
}
    
    /**
     * Your MaxQueue object will be instantiated and called as such:
     * MaxQueue obj = new MaxQueue();
     * int param_1 = obj.max_value();
     * obj.push_back(value);
     * int param_3 = obj.pop_front();
     */

