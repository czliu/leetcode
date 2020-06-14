// 1170. 比较字符串最小字母出现频次
// #easy
// -

package _1170;

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] wordsCount = new int[12];
        for (String s : words) ++wordsCount[count(s)];
        for (int i=9;i>=1;--i) wordsCount[i] += wordsCount[i+1];
        int[] ans = new int[queries.length];
        for (int i=0;i<queries.length;++i) {
            ans[i] = wordsCount[count(queries[i]) + 1];
        }
        return ans;
    }

    private int count(String s) {
        int n = s.length();
        if (n == 0) return 0;
        char c = s.charAt(0);
        int count = 1;
        for (int i=1;i<n;++i) {
            if (s.charAt(i) == c) ++count;
            else if (s.charAt(i) - c < 0) {
                c = s.charAt(i);
                count = 1;
            }
        }
        return count;
    }
}