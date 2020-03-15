// interview01_06   字符串压缩
// 

package interview01_06;

// import java.util.*;
git
class Solution {
    public String compressString(String S) {
        if (S.isEmpty()) {
            return S;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(S.charAt(0));
        int count = 1;
        for (int i = 1; i < S.length(); ++i) {
            if (builder.charAt(builder.length() - 1) == S.charAt(i)) {
                ++count;
            } else {
                builder.append(count);
                count = 1;
                builder.append(S.charAt(i));
            }
        }
        builder.append(count);
        return builder.length() >= S.length() ? S : builder.toString();
    }

    public static void main (String[] args) {
    } 
}
