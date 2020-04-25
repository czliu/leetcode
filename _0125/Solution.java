// 0125. Valid palindrome

// string; 正则表达式

// review

package _0125;

public class Solution {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-z]", "");
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while(i < j)
        {
            if(c[i] != c[j])    return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = "0P";
        boolean ans1 = s.isPalindrome(input1);
        boolean ans2 = s.isPalindrome(input2);
        boolean ans3 = s.isPalindrome(input3);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}