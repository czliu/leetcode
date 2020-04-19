// 0012. Integer to Roman

// string

package _0012;

class Solution {
    public String intToRoman(int num) {
        String ans = "";
        int i = num / 1000;
        while (i > 0) {
            ans += "M";
            --i;
        }
        i = (num % 1000) / 100;
        if (i == 4) ans += "CD";
        else if (i == 9) ans += "CM";
        else {
            if (i >=5) {
                ans += "D";
                i -= 5;
            }
            while (i > 0){
                ans += "C";
                --i;
            }
        }
        i = (num%100) / 10;
        if (i == 4) ans += "XL";
        else if (i == 9) ans += "XC";
        else {
            if (i >=5) {
                ans += "L";
                i -= 5;
            }
            while (i > 0){
                ans += "X";
                --i;
            }
        }
        i = (num%10) / 1;
        if (i == 4) ans += "IV";
        else if (i == 9) ans += "IX";
        else {
            if (i >=5) {
                ans += "V";
                i -= 5;
            }
            while (i > 0){
                ans += "I";
                --i;
            }
        }
        return ans;
    }
}