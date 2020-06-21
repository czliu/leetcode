// 1450. 在既定时间做作业的学生人数
// #easy
// -

package _1450;

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n = startTime.length;
        int count = 0;
        for (int i=0;i<n;++i) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) ++count;
        }
        return count;
    }
}
