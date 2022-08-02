package _1491;

public class Solution2 {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int len = salary.length;
        double sum = 0;
        for (int i=0;i<len;++i) {
            sum += salary[i];
            if (salary[i] < min) {
                min = salary[i];
            }
            else if (salary[i] > max) {
                max = salary[i];
            }
        }
        double average = (sum - min - max) / (len - 2);
        return average;
    }
}
