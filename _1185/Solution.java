// 1185. 一周中的第几天
// #easy
// -

package _1185;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int[] daysInMon = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        if (year % 4 == 0) daysInMon[1] = 29;
        if (year % 100 == 0) daysInMon[1] = 28;
        if (year % 400 == 0) daysInMon[1] = 29;
        // 1993.1.1 is Friday
        String[] ans = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int index = 5;
        if (year < 1993) {
            while (year < 1993) index -= days(year++); // index is negative
        } else {
            while (year > 1993) index += days(--year);
        }
        index = (index % 7 + 7) % 7;
        month -= 2;
        while (month >= 0) index += daysInMon[month--];
        index += (day - 1);
        index = index % 7;
        return ans[index];
    }

    private int days(int year) {
        int ans = 365;
        if (year % 4 == 0) ans = 366;
        if (year % 100 == 0) ans = 365;
        if (year % 400 == 0) ans = 366;
        return ans;
    }
}
