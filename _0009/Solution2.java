package _0009;

public class Solution2 {
    // convert int to String
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        String s = String.valueOf(x);
        int len = s.length();
        for (int i=0;i<len-i;++i) {
            while(s.charAt(i) != s.charAt(len-1-i)) {
                return false;
            }
        }
        return true;
    }

    // without convert int to String
    public boolean isPalindrome2(int x) {
        if (x<0 || (x % 10 == 0 && x != 0)) return false;
        int reverse = 0;
        while (x > reverse) {
            reverse *= 10;
            reverse += x % 10;
            if (x == reverse) return true;
            x = x / 10;
        }
        if (x == reverse) return true;
        return false;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int x1 = 10;
        boolean ans = s.isPalindrome2(x1);
        int x2 = 121;
        boolean ans2 = s.isPalindrome2(x2);
        System.out.printf("%b, %b", ans, ans2);
    }
}
