// 0043. multiply strings
// *
// #medium #string

package _0043;

public class Solution {

    public String multiply(String num1, String num2) {
        int n1= num1.length(), n2 = num2.length();
        int[] sum = new int[n1 + n2];
        for (int i=0;i<n1;++i){
            for (int j=0;j<n2;++j){
                int cur = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int cur1 = cur / 10;
                int cur2 = cur % 10;
                sum[i+j] += cur1;
                sum[i+j+1] += cur2;
            }
        }
        int carry = 0;
        for (int i=n1+n2-1;i>=0;--i){
            sum[i] += carry;
            carry = sum[i] / 10;
            sum[i] = sum[i] % 10;
        }
        String ans = Integer.toString(carry);
        for (int i=0;i<=n1+n2-1;++i){
            ans += Integer.toString(sum[i]);
        }
        int i=0;
        while (i < ans.length()-1){
            if (ans.charAt(i) != '0') break;
            ++i;
        }
        return ans.substring(i);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ans = s.multiply("2", "3");
        System.out.println(ans);
    }
    
}