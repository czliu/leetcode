//27.Remove Element

#include <iostream>
#include <Vector>
using namespace std; 

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int initialSize= nums.size();
        if (initialSize == 0) {
            return 0;
        }
        for (int i=initialSize-1;i>=0;i--){
            if (nums[i] == val){
                nums.erase(nums.begin()+i);
            }
        }
        return nums.size();
    }
};

int main(void) {
    Solution s;
    vector<int> a{0,1,2,2,3,0,4,2};
    int result = s.removeElement(a, 2);
    cout << result;
    return 0;
}