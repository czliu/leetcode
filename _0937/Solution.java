// 937. 重新排列日志文件
// #easy
// -

package _0937;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> listc = new ArrayList<>(); // characters
        List<String> listd = new ArrayList<>(); // digits
        for (String s : logs) {
            int i = 0;
            while (s.charAt(i) != ' ') ++i;
            char c = s.charAt(i+1);
            if (Character.isDigit(c)) listd.add(s);
            else {
                if (listc.isEmpty()) listc.add(s);
                else {
                    int j = 0;
                    while (j < listc.size()) {
                        if (compare(listc.get(j), s)) {
                            listc.add(j, s);
                            break;
                        }
                        if (j == listc.size() - 1) {
                            listc.add(s);
                            break;
                        }
                        ++j;
                    }
                }
            }
        }
        String[] ans = new String[listc.size() + listd.size()];
        for (int i=0;i<listc.size();++i) ans[i] = listc.get(i);
        for (int i=listc.size();i<ans.length;++i) ans[i] = listd.get(i-listc.size());
        return ans;
    }

    private boolean compare(String s1, String s2) {
        int i1 = 0;
        while (s1.charAt(i1) != ' ') ++i1;
        int i2 = 0;
        while (s2.charAt(i2) != ' ') ++i2;
        int content = s1.substring(i1).compareTo(s2.substring(i2));
        if (content > 0) return true;
        else if (content < 0) return false;
        int id = s1.substring(0,i1).compareTo(s2.substring(0,i2));
        if (id > 0) return true;
        else return false;
    }
}