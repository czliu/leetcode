// 0299. bulls and cows
// #easy #string
// -

package _0299;

class Solution {
    public String getHint(String secret, String guess) {
        int[] digitsS = new int[10];
        int[] digitsG = new int[10];
        int bulls = 0;
        int cows = 0;
        int len = secret.length();
        for (int i=0;i<len;++i) {
            if (secret.charAt(i) == guess.charAt(i)) ++bulls;
            else {
                ++digitsS[secret.charAt(i) - '0'];
                ++digitsG[guess.charAt(i) - '0'];
            }
        }
        for (int i=0;i<10;++i) {
            cows += Math.min(digitsS[i], digitsG[i]);
        }
        return String.valueOf(bulls) + "A" + String.valueOf(cows) + "B";
    }
}