// 1491. 去掉最低工资和最高工资后的工资平均值
// #easy
// -

package _1491;

class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = salary[0];
        for (int i=1;i<salary.length;++i) {
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
            sum += salary[i];
        }
        return ((double)sum - max - min) / (salary.length - 2);
    }
}