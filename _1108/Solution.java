// 1108. defanging an IP address
// #easy #string
// -

package _1108;

public class Solution {

    public String defangIPaddr(String address) {
        String ans = "";
        int i = 0;
        while (i < address.length()){
            if (address.charAt(i) == '.') ans += "[.]";
            else ans += address.charAt(i);
            ++i;
        }
        return ans;
    }
    
}