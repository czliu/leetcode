// 1021. 删除最外层的括号
// #easy
// -

package _1021;

import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String S) {
        int tmp = 0;
        int start = -1;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<S.length();++i) {
            if (start == -1 && S.charAt(i) == '(') {
                start = i;
                tmp = 1;
            } else if (S.charAt(i) == '(') ++tmp;
            else if (S.charAt(i) == ')') {
                --tmp;
                if (tmp == 0) {
                    sb .append(S.substring(start+1, i));
                    start = -1;
                }
            }
        }
        return sb.toString();
    }
}
