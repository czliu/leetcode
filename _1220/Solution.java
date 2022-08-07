package _1220;

public class Solution {
    int max = (int)Math.pow(10, 9) + 7;

    public int countVowelPermutation(int n) {
        double[] cur = new double[]{1,1,1,1,1};
        if (n == 1) return sum(cur);
        for (int i=2;i<=n;++i) {
            double[] pre = new double[5];
            for (int k=0;k<5;++k) pre[k] = cur[k];
            cur[0] = pre[1];
            cur[1] = pre[0] + pre[2];
            cur[2] = pre[0] + pre[1] + pre[3] + pre[4];
            cur[3] = pre[2] + pre[4];
            cur[4] = pre[0];
            for (int j=0;j<5;++j) {
                if (cur[j] >= max) cur[j] = cur[j] % max;
            }
        }
        return sum(cur);
    }

    public int sum(double[] a) {
        double b = 0;
        for (int i=0;i<a.length;++i) {
            b += a[i];
        }
        if (b >= max) b = b % max;
        return (int)b;
    }
}
