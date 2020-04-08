// interview13. 机器人的运动范围

// BFS 广度优先搜索

package interview13;

import java.util.*;

class Solution {
    public int movingCount(int m, int n, int k) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] {0,0});
        int[] x = {-1,0,0,1}; // delta x
        int[] y = {0,-1,1,0}; // delta y
        int[][] helper = new int[m][n];
        helper[0][0] = 1;
        int ans = 1;
        while (!stack.empty()){
            int[] temp = stack.pop();
            for (int i=0;i<=3;++i){
                int p = temp[0]+x[i];
                int q = temp[1]+y[i];
                if (p >= 0 && p < m && q >= 0 && q < n && helper[p][q] == 0 && digitSum(p)+digitSum(q) <= k){
                    stack.push(new int[] {p,q});
                    helper[p][q] = 1;
                    ++ans;
                }
            }
        }
        return ans;
    }

    private int digitSum(int n){
        int ans = 0;
        while (n != 0) {
            ans += n%10;
            n = n/10;
        }
        return ans;
    }

    public static void main(String[] args){

    }
}