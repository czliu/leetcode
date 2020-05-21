// 0557. reverse words in a string III
// #easy #string
// -

package _0557;

public class Solution {

    public String reverseWords(String s) {
        String ans = "";
        int n = s.length();
        if (n == 0) return ans;
        boolean inWord = false;
        int start = 0;
        for (int i=0;i<n;++i) {
            if (inWord == false && s.charAt(i) != ' ') {
                inWord = true;
                start = i;
            } else if (inWord == true && s.charAt(i) == ' ') {
                inWord = false;
                for (int j=i-1;j>=start;--j) {
                    ans += s.charAt(j);
                }
                ans += " ";
            }
            if (i == n - 1 && inWord == true) {
                for (int j=i;j>=start;--j) {
                    ans += s.charAt(j);
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        String ans = s.reverseWords("I love u");
        System.out.println(ans);
    }
}