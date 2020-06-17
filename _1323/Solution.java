// 1323. 6 和 9 组成的最大数字
// #easy
// -

package _1323;

import java.util.Arrays;

class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        int index = -1;
        for (int i=0;i<s.length();++i)  {
            if (s.charAt(i) == '6') {
                index = i;
                break;
            }
        }
        if (index == -1) return Integer.parseInt(s);
        else {
            String ans = s.substring(0,index) + "9" + s.substring(index+1);
            return Integer.parseInt(ans);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int ans = s.maximum69Number(996);
        System.out.println(ans);
    }
}