// 0728. self dividing numbers
// #easy
// -

package _0728;

import java.util.*;

public class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new LinkedList<>();
        for (int i=left;i<=right;++i){
            if (isSelfDividing(i)) ans.add(i);
        }
        return ans;
    }

    private boolean isSelfDividing(int n) {
        int k = n;
        while (k > 0) {
            int x = k % 10;
            if (x == 0 || n % x != 0) return false;
            k = k / 10;
        }
        return true;
    }
    
}