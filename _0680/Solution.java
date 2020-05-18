// 0680. Valid palindrome II
// #easy #string
// -
// related: 0125. Valid palindrome

package _0680;

public class Solution {

    public boolean validPalindrome(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while(i < j) {
            if(c[i] != c[j]) {
                if (isPalindrome(s.substring(i+1, j+1))) return true;
                else if (isPalindrome(s.substring(i, j))) return true;
                else return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    private boolean isPalindrome(String s) {
        //System.out.println(s);
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while(i < j) {
            if(c[i] != c[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean ans = s.validPalindrome("lcupuuuupucul");
        System.out.println(ans);
    }
}