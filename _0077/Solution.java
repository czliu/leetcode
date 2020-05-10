// 0077. combinations
// #medium #backtrack
// *

package _0077;

import java.util.*;

public class Solution {

    List<List<Integer>> ans = new LinkedList<>();
    int n;
    int k;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        if (n == 0)
            return ans;
        LinkedList<Integer> cur = new LinkedList<>();
        backtrack(1, cur);
        return ans;
    }

    private void backtrack(int first, LinkedList<Integer> cur) {
        if (cur.size() == k) {
            ans.add(new LinkedList<Integer>(cur));
            return;
        }
        for (int i = first; i <= n; ++i) {
            cur.add(i);
            backtrack(i + 1, cur);
            cur.removeLast();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> ans = s.combine(4, 2);
        System.out.println(ans);
    }
}