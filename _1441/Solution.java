// 1441. 用栈操作构建数组
// #easy
// -

package _1441;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new LinkedList<>();
        int len = target.length;
        if (len == 0) return list;
        int i = 1, index = 0;
        while (i <= target[len-1]) {
            while (i < target[index]) {
                list.add("Push");
                list.add("Pop");
                ++i;
            }
            list.add("Push");
            ++index;
            ++i;
        }
        return list;
    }
}
