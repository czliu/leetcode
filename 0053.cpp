//53. Maximum Subarray

//Greedy Algorithm

#include <iostream>
#include <Vector>
using namespace std; 

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int current_sum = 0;
        int max_sum = nums[0];
        for (int i=0;i<=nums.size()-1;i++){
            current_sum = max(nums[i], current_sum + nums[i]);
            max_sum = max(max_sum, current_sum);
        }
        return max_sum;
    }
};

int main(void) {
    Solution s;
    vector<int> a1{-2,1,-3,4,-1,2,1,-5,4};
    string verdict1 = (s.maxSubArray(a1) == 6)? "Pass" : "Fail";
    cout << verdict1 << "\n";
    vector<int> a2{1};
    string verdict2 = (s.maxSubArray(a2) == 1)? "Pass" : "Fail";
    cout << verdict2;
    return 0;
}
