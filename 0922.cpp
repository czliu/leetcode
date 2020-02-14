// 0922. Sort Array By Parity II

#include <iostream>
#include <vector>
#include <algorithm>
#include <iterator>
using namespace std;

class Solution {
public:
    vector<int> sortArrayByParityII(vector<int>& A) {
        vector<int> B = A;
        int i_even=0;
        int i_odd=1;
        for (int i=0;i<A.size();i++){
            if (A[i] % 2 == 0) {
                B[i_even] = A[i];
                i_even += 2;
            } else {
                B[i_odd] = A[i];
                i_odd += 2;
            }
        }
        return B;
    }
};

int main(void) {
    Solution s;
    vector<int> A = {4,2,5,7};
    vector<int> B = s.sortArrayByParityII(A);
    for (int i : B) cout << i << " ";
    return 0;
}