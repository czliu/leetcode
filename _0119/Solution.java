// 0119. pascal's triangle II
// *
// #easy

package _0119;

import java.util.*;

public class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for (int i=0;i<=rowIndex;++i){
            cur.clear();
            if (i == 0) {
                cur.add(1);
                // this is wrong
                // pre = cur; 
                pre = new ArrayList<>(cur);
            }
            else {
                for (int j=0;j<=i;++j){
                    if (j == 0 || j == i) cur.add(1);
                    else cur.add(pre.get(j-1) + pre.get(j));
                }
                pre = new ArrayList<>(cur);
            }
        }
        return cur;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> ans = new ArrayList<>();
        ans = s.getRow(2);
        System.out.println(ans);
    }
}