// 929. 独特的电子邮件地址
// #easy
// -

package _0929;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            set.add(shorten(email));
        }
        return set.size();
    }

    private String shorten(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (s.charAt(i) != '@') {
            char c = s.charAt(i);
            if (c == '+') {
                while (s.charAt(i) != '@') ++i;
            }
            else if (c == '.') ++i;
            else {
                sb.append(c);
                ++i;
            }
        }
        sb.append(s.substring(i));
        return sb.toString();
    }
}