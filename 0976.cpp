// 0976. Largest Perimeter Triangle

#include <iostream>
#include <vector>
#include <algorithm>
#include <iterator>
using namespace std;

class Solution {
public:
    int largestPerimeter(vector<int>& A) {
        sort(A.begin(), A.end());
        for (int i=A.size()-1;i>=2;i--){
            if (A[i-2]+A[i-1] > A[i]) return A[i-2]+A[i-1]+A[i];
        }
        return 0;
    }
};

int main(void) {
    Solution s;
    vector<int> A = {1,2,1};
    int b = s.largestPerimeter(A);
    cout << b;
    return 0;
}