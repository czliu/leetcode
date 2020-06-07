// 925. 长按键入
// #easy
// -

package _0925;

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int lenName = name.length();
        int lenTyped = typed.length();
        if (lenName > lenTyped) return false;
        int i = 0, j = 0;
        while (i < lenName && j < lenTyped) {
            if (name.charAt(i) != typed.charAt(j)) return false;
            char pre = name.charAt(i);
            int count1 = 0;
            while (i < lenName && name.charAt(i) == pre) {
                ++i;
                ++count1;
            }
            pre = typed.charAt(j);
            int count2 = 0;
            while (j < lenTyped && typed.charAt(j) == pre) {
                ++j;
                ++count2;
            }
            if (count1 > count2) return false;
        }
        if (i < lenName || j < lenTyped) return false;
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean ans = s.isLongPressedName("pyplrz", "ppyypllr");
        System.out.println(ans);
    }
}