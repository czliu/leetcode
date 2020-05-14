// 0204. count primes
// #easy
// *

package _0204;

import java.util.*;

public class Solution {

    // Time n/2 + n/3 + n/5 + n/7...
    // Time O(n * loglogn)
    int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i < n; ++i)
            if (isPrime[i])
                for (int j = i * i; j < n; j += i)
                    isPrime[j] = false;
                    
        int count = 0;
        for (int i = 2; i < n; i++)
            if (isPrime[i])
                count++;

        return count;
    }

}