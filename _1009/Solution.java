// 1009. complement of base 10 integer
// #easy #bit
// *
// the same as 0476

package _1009;

class Solution {
    public int bitwiseComplement(int N) {
        int move = 0;
        int ans = 0;
        if (N == 0) return 1;
        while(N != 0){
            int tmp = N & 1;
            if(tmp == 0) ans += (1 << move);
            move++;
            N >>>= 1;
        }
        return ans;
    }
}