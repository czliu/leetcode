// 1154. 一年中的第几天
// #easy
// -

package _1154;

class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int mon = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int[] daysInMon = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        if (year % 4 == 0) daysInMon[1] = 29;
        if (year % 100 == 0) daysInMon[1] = 28;
        if (year % 400 == 0) daysInMon[1] = 29;
        int i = 0, ans = 0;
        while (i < mon-1) {
            ans += daysInMon[i];
            ++i;
        }
        ans += day;
        return ans;
    }
}