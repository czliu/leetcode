// 0482. license key formatting
// #easy #string
// - 

package _0482;

public class Solution {

    // 遍历2遍
    // public String licenseKeyFormatting(String S, int K) {
    //     String tmp = "";
    //     for (int i = 0; i < S.length(); ++i) {
    //         if (S.charAt(i) != '-')
    //             tmp += S.charAt(i);
    //     }
    //     tmp = tmp.toUpperCase();
    //     int n = tmp.length();
    //     if (n == 0) return tmp;
    //     int first = n % K;
    //     String ans = "";
    //     if (first != 0) ans += (tmp.substring(0, first) + "-");
    //     for (int i = 0;i<n/K;++i){
    //         ans += (tmp.substring(K * i + first, K * (i+1) + first) + "-");
    //     }
    //     return ans.substring(0, ans.length()-1);
    // }

    //遍历1遍
    public String licenseKeyFormatting(String S, int K) {
        String ans = "";
        char cur;
        int count = 0;
        for (int i=S.length()-1;i>=0;--i){
            if (S.charAt(i) == '-') continue;
            else if (S.charAt(i) - 'a' >= 0 && 'z' - S.charAt(i) >= 0) cur = (char)(S.charAt(i) - 'a' + 'A');
            else cur = S.charAt(i);
            if (count == K) {
                ans = cur + "-" + ans;
                count = 0;
            } else {
                ans = cur + ans;
                ++count;
            }
        }
        return ans;
    }

}