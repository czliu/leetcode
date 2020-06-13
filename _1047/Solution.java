// 1047. 删除字符串中的所有相邻重复项
// #easy
// -*

package _1047;

// 自己写的算法， 不如solution2里的stack
class Solution {
    public String removeDuplicates(String S) {
        char[] C = S.toCharArray();
        int n = C.length;
        for (int i=0;i<=n-2;++i) {
            if (C[i] != '0' && C[i+1] != '0' && C[i] == C[i+1]) {
                C[i] = '0';
                C[i+1] = '0';
                int left = i-1, right = i+2;
                while (left >= 0 && right <= n-1) {
                    while (left>= 0 && C[left] == '0') --left;
                    while (right <= n-1 && C[right] == '0') ++right;
                    if (left >= 0 && right <= n-1 && C[left] == C[right]) {
                        C[left] = '0';
                        C[right] = '0';
                        --left;
                        ++right;
                    } else break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : C) {
            if (c != '0') sb.append(c);
        }
        return sb.toString();
    }
}

class Solution2 {
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        int sbLen = 0;
        for (char c : S.toCharArray()) {
            if (sbLen != 0 && c == sb.charAt(sbLen - 1))
                sb.deleteCharAt(sbLen-- - 1);
            else {
                sb.append(c);
                sbLen++;
            }
        }
        return sb.toString();
    }
}

