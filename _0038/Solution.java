//0038. Count and say

//string

package _0038;

public class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String pre = "1";
        for (int i=2;i<=n;++i){
            String cur = "";
            for (int j=0;j<pre.length();){
                char tmp = pre.charAt(j);
                int count = 0;
                while (j < pre.length() && pre.charAt(j) == tmp) {
                    ++count;
                    ++j;
                }
                cur += Integer.toString(count);
                cur += tmp;
            }
            pre = cur;
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ans = s.countAndSay(4);
        System.out.println(ans);
    }
}