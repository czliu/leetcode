// 0412. fizz buzz
// #easy
// -

package _0412;

import java.util.*;

public class Solution {

    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        if (n == 0) return list;
        for (int i=1;i<=n;++i) {
            String cur = "";
            if (i % 3 == 0) cur += "Fizz";
            if (i % 5 == 0) cur += "Buzz";
            if (i % 3 != 0 && i % 5 != 0) cur = String.valueOf(i);
            list.add(cur);
        }
        return list;
    }
    
}