// 0006. zigzag conversion
// *
// #medium #string

package _0006;

public class Solution {

    public String convert(String s, int numRows) {
        if (numRows <= 0) return "";
        if (s == null || s.length() == 0) return "";
        if (numRows == 1) return s;  //*
        int direction = 1;
        String[] a = new String[numRows];
        for (int i=0;i<numRows;++i) a[i] = ""; //*
        int k = 0;
        for (int i=0;i<s.length();++i){
            a[k] += s.charAt(i);
            if (k == 0) direction = 1;
            else if (k == numRows-1) direction = -1;
            k += direction;
        }
        String ans = "";
        for (String tmp : a) ans += tmp;
        return ans;
    }
}