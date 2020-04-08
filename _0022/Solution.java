// 0022. Generate parentheses

// dfs　深度优先搜索

package _0022;

import java.util.*;

public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 0) return ans;
        dfs(ans, "", n, n);
        return ans;
    }

    private void dfs(List<String> ans, String curString, int left, int right){
        if (left > right) return;
        if (left > 0) {
            dfs(ans, curString + "(", left-1, right);
        }
        if (right > 0) {
            dfs(ans, curString + ")", left, right-1);
        }
        if (left == 0 && right == 0){
            ans.add(curString);
            return;
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        List<String> ans = s.generateParenthesis(2);
        for (String i : ans) System.out.println(i);
    }
}