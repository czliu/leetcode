// 0434. Number of segments in a string

// string

package _0434;

public class Solution {

    public int countSegments(String s) {
        boolean insideSeg = false;
        int count = 0;
        for (int i=0;i<s.length();++i){
            if (s.charAt(i) == ' ') {
                if (insideSeg == false) continue;
                else {
                    insideSeg = false;
                    ++count;
                }
            }
            else { //s.charAt(i) != ' '
                if (insideSeg == false) insideSeg = true;
                else continue;
            }
        }
        if (insideSeg == true) ++count;
        return count;
    }

}