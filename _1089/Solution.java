// 1089. 复写零
// #easy
// -

package _1089;

class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int count = 0; // number of double zeros in the result
        boolean singleZeroEnd = false;
        for (int i=0;i<n;++i) {
            if (arr[i] == 0) {
                ++count;
                if (i + count > n-1) {
                    if (i + count == n) singleZeroEnd = true;
                    --count;
                    break;
                }
            }
        }
        if (count == 0) return;
        int index = n-1;
        int end = n-1-count;
        if (singleZeroEnd == true) {
            arr[index--] = 0;
            --end;
        }
        for (int i=end;i>=0;--i) {
            if (arr[i] == 0) {
                arr[index--] = 0;
                arr[index--] = 0;
            } else arr[index--] = arr[i];
        }
        return;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.duplicateZeros(new int[] {8,5,0,9,0,3,4,7});
    }
}