// 949. 给定数字能组成的最大时间
// #easy
// *

package _0949;

class Solution {
    public String largestTimeFromDigits(int[] A) {
        int[] digits = new int[10];
        for (int i : A) ++digits[i];
        if (digits[2] > 0) {
            --digits[2];
            for (int i=3;i>=0;--i) {
                if (digits[i] > 0) {
                    --digits[i];
                    String s = check(digits);
                    if (s.length() != 0) return "2" + i + ":" + s;
                    ++digits[i];
                }
            }
            ++digits[2];
        }
        if (digits[1] > 0) {
            --digits[1];
            for (int i=9;i>=0;--i) {
                if (digits[i] > 0) {
                    --digits[i];
                    String s = check(digits);
                    if (s.length() != 0) return "1" + i + ":" + s;
                    ++digits[i];
                }
            }
            ++digits[1];
        }
        if (digits[0] > 0) {
            --digits[0];
            for (int i=9;i>=0;--i) {
                if (digits[i] > 0) {
                    --digits[i];
                    String s = check(digits);
                    if (s.length() != 0) return "0" + i + ":" + s;
                    else ++digits[i];
                }
            }
        }
        return "";
    }

    private String check(int[] digits) {
        int lo = -1;
        int hi = -1;
        for (int i=0;i<=9;++i) {
            if (digits[i] == 2) {
                lo = i;
                hi = i;
            }else if (digits[i] == 1 && lo == -1) {
                lo = i;
            }else if (digits[i] == 1 && hi == -1) {
                hi = i;
            }
        }
        if (hi <= 5) return "" + hi + lo;
        else if (lo <= 5) return "" + lo + hi;
        else return "";
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ans = s.largestTimeFromDigits(new int[] {9,0,7,7});
        System.out.println(ans);
    }
}