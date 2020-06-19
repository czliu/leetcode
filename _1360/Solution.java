package _1360;

public class Solution {

    public int daysBetweenDates(String date1, String date2) {
        int year1 = Integer.parseInt(date1.substring(0, 4));
        int year2 = Integer.parseInt(date2.substring(0, 4));
        int days = dayOfYear(date2) - dayOfYear(date1);
        // days is the number of days from date1 to date2
        // can be negative
        while (year1 != year2) {
            if (year1 < year2) {
                days += daysInYear(year1);
                ++year1;
            }
            else {
                days -= daysInYear(year2);
                ++year2;
            }
        }
        return Math.abs(days);
    }

    private int daysInYear(int year) {
        int days = 365;
        if (year % 4 == 0) days = 366;
        if (year % 100 == 0) days = 365;
        if (year % 400 == 0) days = 366;
        return days;
    }

    private int dayOfYear(String date) {
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
