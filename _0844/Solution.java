// 844. 比较含退格的字符串
// #easy
// -

package _0844;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        String newS = helper(S);
        String newT = helper(T);
        return newS.equals(newT);
    }

    private String helper(String S) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<S.length();++i) {
            if (S.charAt(i) != '#') sb.append(S.substring(i, i+1));
            else {
                int len = sb.length();
                if (len >= 1) sb.deleteCharAt(len-1); 
            }
        }
        return sb.toString();
    }
}