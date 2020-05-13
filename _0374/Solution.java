// 0374. guess number higher or lower
// #easy
// *

package _0374;

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

// public class Solution extends GuessGame{

//     public int guessNumber(int n) {
//         int low = 1, high = n;
//         int mid = 0;
//         while (low <= high) {
//             mid = (high - low) / 2 + low;
//             int k = guess(mid);
//             if (k == 1) low = mid+1;
//             else if (k == -1) high = mid-1;
//             else break;
//         }
//         return mid;
//     }
    
// }