// 0058. length of last word

// string

package _0058;

public class Solution {

    public int lengthOfLastWord(String s) {
        boolean wordExist = false;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (wordExist == false) {
                if (s.charAt(i) == ' ') continue;
                else {
                    wordExist = true;
                    ++ans;
                    continue;
                }
            }
            else { // wordExist == true
                if (s.charAt(i) == ' ') {
                    return ans;
                }
                else {
                    ++ans;
                    continue;
                }
            }
        }
        if (wordExist == false) return 0;
        else return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "afdsafefsfafa   ";
        int ans = s.lengthOfLastWord(a);
        System.out.println(ans);
    }
}