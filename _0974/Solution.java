// 0974.和可被 K 整除的子数组
// #medium
// *

package _0974;

class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int n = A.length;
        int[] count = new int[K];
        int sum = 0;
        for (int i=0;i<n;++i){
            sum += A[i];
            sum = sum % K;
            if (sum < 0) sum += K;
            ++count[sum];
        }

        int ans = 0;
        for (int i=0;i<K;++i) {
            ans += helper(count[i]);
        }
        return count[0] + ans;
    }

    private int helper(int a) {
        return a * (a - 1) / 2;
    }
}