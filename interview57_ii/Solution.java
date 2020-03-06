// interview57_II. 和为s的连续正数序列
// 滑动窗口

package interview57_ii;

import java.util.*;

class Solution {

    public int[][] findContinuousSequence(int target) {
        LinkedList<int[]> list = new LinkedList<>();
        int i=1, j=2;
        int sum = i + j;
        while (i < target) {
            if (sum == target) {
                int[] temp = new int[j-i+1];
                for (int k=i;k<=j;k++) temp[k-i] = k;
                list.add(temp);
                sum -= i;
                i++;
            }
            else if (sum < target) {
                j++;
                sum += j;
            }
            else {
                sum -= i;
                i++;
            };
        }
        // convert LinkedList to int[][]
        int n = list.size();
        int max = 0;
        for (int[] item : list) max = max > item.length ? max : item.length;
        int[][] ans = new int[n][max];
        int ind = 0;
        for (int[] item : list) ans[ind++] = item;
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] output = s.findContinuousSequence(15);
        for (int[] i : output) System.out.println(i);
    }
}
