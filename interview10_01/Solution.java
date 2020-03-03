// interview 10.01, Sorted Merge LCCI
// 

package interview10_01;

// import java.util.*;

class Solution {

    public void merge(int[] A, int m, int[] B, int n) {
        int i = 0, j = 0;
        while (j <= n-1) {
            if (A[i] < B[j] && i <= m-1) {
                i++;
            }
            else if (A[i] >= B[j]) { 
                for (int k=m-1;k>=i;k--) A[k+1] = A[k];
                m++;
                A[i] = B[j];
                j++;
            }
            else {  // i>m-1
                for (;j<=n-1;i++, j++) A[i] = B[j];
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5,6};
        s.merge(A,3,B,3);
        System.out.println(A);
    }
}
