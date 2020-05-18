// 0476. number complement
// #easy #bit
// *
// The same as 1009

package _0476;

public class Solution {

    public int findComplement(int num) {
        int move = 0;
        int ans = 0;
        if (num == 0) return 1;
        while(num != 0){
            int tmp = num & 1;
            if(tmp == 0) ans += (1 << move);
            move++;
            num >>>= 1;
        }
        return ans;
    }
    
}