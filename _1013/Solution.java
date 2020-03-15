// 1013. Partition Array into three parts with equal sum
// 


package _1013;

// import java.util.*;

class Solution {

    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i:A) sum += i;
        if (sum%3 != 0) return false;

        int left = 0;
        int right = A.length-1;
        int sumLeft = A[0];
        int sumRight = A[A.length-1];
        while (left + 1 < right) {
            if (sumLeft == sum/3 && sumRight == sum/3) return true;
            else if (sumLeft != sum/3) {
                sumLeft += A[left+1];
                left++; 
            }
            else if (sumRight != sum/3) {
                sumRight += A[right-1];
                right--; 
            }
        }
        return false;
    }

    public static void main(String[] args) {
    }
}
