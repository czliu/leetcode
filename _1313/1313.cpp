//1313. Decompress Run-Length Encoded List

#include <iostream>
#include <Vector>
using namespace std; 

class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        vector<int> decom;
        for (int i=0; i<=nums.size()/2-1; i++){
            for (int j=0; j<=nums[i*2]-1; j++){
                decom.push_back(nums[i*2+1]);
            }
        }
        return decom;
    }
};

int main(void) {
    Solution s;
    vector<int> a1{1,2,3,4};
    for (auto i:s.decompressRLElist(a1)) cout << i << " ";
    return 0;
}
