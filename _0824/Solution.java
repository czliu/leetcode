// 824. 山羊拉丁文
// #easy
// -

package _0824;

class Solution {
    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        int start = -1, count = 0;
        for (int i=0;i<S.length();++i) {
            char c = S.charAt(i);
            if (start == -1 && Character.isLetter(c)) start = i;
            else if (start != -1 && !Character.isLetter(c)) {
                String cur = S.substring(start, i);
                ++count;
                sb.append(helper(cur, count)).append(" ");
                start = -1;
            }
            if (start != -1 && i == S.length()-1) {
                String cur = S.substring(start, i+1);
                ++count;
                sb.append(helper(cur, count));
            }
        }
        return sb.toString();       
    }

    private String helper(String cur, int count) {
        StringBuilder sb = new StringBuilder();
        char c = Character.toLowerCase(cur.charAt(0));
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            sb.append(cur).append("ma");
        }
        else if (cur.length() >= 2) {
            sb.append(cur.substring(1)).append(cur.substring(0, 1)).append("ma");
        }
        else sb.append(cur).append("ma");
        for (int i=1;i<=count;++i) sb.append("a");
        return sb.toString();
    }
}