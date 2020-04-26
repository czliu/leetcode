// 0415. Add strings

// string

package _0415;

public class Solution {

    public String addStrings(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        if (n1 < n2) {
            String tmp = num1;
            num1 = num2;
            num2 = tmp;
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        // now n1 >= n2
        char[] sum = new char[n1];
        int carry = 0;
        for (int i=n1-1;i>=n1-n2;--i){
            int tmp = (num1.charAt(i) - '0') + (num2.charAt(i-(n1-1)+(n2-1)) - '0') + carry;
            if (tmp >= 10) {
                tmp -= 10;
                carry = 1;
            }
            else carry = 0;
            sum[i] = (char)(tmp + '0');
        }
        for (int i=n1-n2-1;i>=0;--i){
            int tmp = (num1.charAt(i) - '0') + carry;
            if (tmp >= 10) {
                tmp -= 10;
                carry = 1;
            }
            else carry = 0;
            sum[i] = (char)(tmp + '0');
        }
        String ans = new String(sum);
        if (carry == 1) ans = "1" + ans;
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ans = s.addStrings("0", "0");
        String ans2 = s.addStrings("9", "99");
        System.out.println(ans);
        System.out.println(ans2);
    }
}