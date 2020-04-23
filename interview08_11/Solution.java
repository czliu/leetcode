// interview08_11 coin LCCI

// dp
// review

package interview08_11;

// import java.util.*;

public class Solution {
    public int waysToChange(int n) {
        int[] f = new int[n+1];
        f[0] = 1;
        int[] coins = new int[] {25, 10, 5, 1};
        for (int i=0;i<4;++i){
            int coin = coins[i];
            for (int j=coin;j<=n;++j){
                f[j] = (f[j] + f[j-coin]) % 1000000007;
            }
        }
    return f[n];
    }
}