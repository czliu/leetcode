// 0118. pascal's triangle
// -
// #easy

package _0118;

import java.util.*;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) return ans;
        for (int i=0;i<=numRows-1;++i){
            List<Integer> list = new ArrayList<>();
            if (i == 0) {
                list.add(1);
                ans.add(list);
            }
            else {
                List<Integer> pre = new ArrayList<>(ans.get(i-1));
                for (int j=0;j<=i;++j){
                    if (j == 0 || j == i) list.add(1);
                    else list.add(pre.get(j-1) + pre.get(j));
                }
                ans.add(list);
            }
        }
        return ans;
    }

}