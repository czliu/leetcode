// 748. 最短完整词
// #easy
// -

package _0748;

class Solution {

    int[] count = new int[26];
    int n;

    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        for (int i=0;i<licensePlate.length();++i){
            char c = licensePlate.charAt(i);
            if (c - 'a' >= 0 && 'z' - c >= 0) {
                ++count[c - 'a'];
                ++n;
            }
        }
        String ans = "";
        for (String s : words) {
            if (isComplete(s)) {
                if (ans == "") ans = s;
                else ans = shorter(ans, s);
            }
        }
        return ans;
    }

    private boolean isComplete(String s) {
        int len = s.length();
        if (len < n) return false;
        s = s.toLowerCase();
        int[] cur = new int[26];
        for (int i=0;i<len;++i) {
            int k = s.charAt(i) - 'a';
            if (count[k] != 0) ++cur[k];
        }
        for (int i=0;i<26;++i) {
            if (count[i] > cur[i]) return false;
        }
        return true;
    }

    private String shorter(String ans, String s) {
        int lenAns = ans.length();
        int lenS = s.length();
        if (lenAns != lenS) return (lenAns < lenS)? ans : s;
        else return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ans = s.shortestCompletingWord("B687015", new String[] {"born","give","would","nice","in","understand","blue","force","have","that"});
        System.out.println(ans);
    }

}