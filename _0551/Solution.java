// 0551. student attendace record I
// #easy
// -

package _0551;

public class Solution {

    public boolean checkRecord(String s) {
        int a = 0;
        int curL = 0;
        if (s.length() == 0) return true;
        for (int i=0;i<s.length();++i){
            if (s.charAt(i) == 'A') ++a;
            if (s.charAt(i) == 'L') {
                if (curL == 0) curL = 1;
                else ++curL;
            }
            else curL = 0;
            if (a > 1 || curL > 2) return false;
        }
        return true;
    }
    
}