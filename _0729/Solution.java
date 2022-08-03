package _0729;

import java.util.*;

// brute force
public class Solution {
    List<int[]> calendar;

    void MyCalendar() {
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] iv: calendar) {
            if (iv[0] < end && start < iv[1]) return false;
        }
        calendar.add(new int[]{start, end});
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.MyCalendar();
        boolean ans1 = s.book(10, 20);
        boolean ans2 = s.book(15, 25);
        boolean ans3 = s.book(20, 30);
        System.out.printf("%b, %b, %b", ans1, ans2, ans3);
    }
}
