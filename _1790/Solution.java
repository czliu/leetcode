package _1790;

public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int len = s1.length();
        if (len != s2.length()) return false;

        int countDiff = 0;
        int ind1 = -1, ind2 = -1;
        for (int i=0;i<len;++i) {
            if (s1.charAt(i) != s2.charAt(i)) {
                countDiff++;
                if (countDiff == 1) ind1 = i;
                else if (countDiff == 2) ind2 = i;
                else return false;
            }
        }
        if (countDiff == 0) return true;
        if (countDiff == 1) return false;
        
        // countDiff == 2
        if ((s1.charAt(ind1) == s2.charAt(ind2)) && (s1.charAt(ind2) == s2.charAt(ind1))) {
            return true;
        }
        else return false;
    }
}
