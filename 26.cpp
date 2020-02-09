//26. Remove Duplicaets from Sorted Array

#include <iostream>
#include <Vector>
using namespace std; 

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int initialSize= nums.size();
        if (initialSize <= 1) {
            return initialSize;
        }
        for (int i=initialSize-1;i>0;i--){
            if (nums[i-1] == nums[i]){
                nums.erase(nums.begin()+i);
            }
        }
        return nums.size();
    }
};

int main(void) {
    Solution s;
    vector<int> a{0,0,1,1,1,2,2,3,3,4};
    int result = s.removeDuplicates(a);
    cout << result;
    return 0;
}