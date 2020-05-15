// 0290. word pattern
// #easy #string
// *

package _0290;

import java.util.*;

public class Solution {

    public boolean wordPattern(String pattern, String str) {
        int lenPattern = pattern.length();
        if (lenPattern == 0 && str.length() == 0) return true;
        else if (lenPattern == 0 || str.length() == 0) return false;
        ArrayList<String> patternList = new ArrayList<>();
        for (int i=0;i<lenPattern;++i) {
            patternList.add(pattern.substring(i, i+1));
        }
        ArrayList<String> strList = new ArrayList<>();
        int start = -1;
        for (int i=0;i<str.length();++i) {
            if (str.charAt(i) == ' ') {
                if (start != -1) {
                    strList.add(str.substring(start, i));
                    start = -1;
                }
                else continue;
            }
            else if (start == -1) start = i;
            else continue;
        }
        if (start != -1) strList.add(str.substring(start));
        return isMatch(patternList, strList) && isMatch(strList, patternList);
    }

    private boolean isMatch(ArrayList<String> a, ArrayList<String> b) {
        int na = a.size();
        int nb = b.size();
        if (na != nb) return false;
        Map<String, String> map = new HashMap<>();
        for (int i=0;i<na;++i) {
            if (map.containsKey(a.get(i))) {
                // if (map.get(a.get(i)) != b.get(i)) return false;
                if (map.get(a.get(i)).equals(b.get(i)) == false) return false;
                // == tests for reference equality (whether they are the same object).
                //.equals() tests for value equality (whether they are logically "equal").
            }
            else map.put(a.get(i), b.get(i));
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean ans = s.wordPattern("abba", "dog cat cat dog");
        System.out.println(ans);
    }
    
}