// 0075. Sort Colors

#include <iostream>
#include <vector>
#include <algorithm>
#include <iterator>
using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int i0 = 0;
        int i2 = nums.size()-1;
        int curr = 0;
        while (curr<=i2) {
            if (nums[curr] == 0 && curr > i0) {
                swap(nums[i0], nums[curr]);
                i0++;
            } else if (nums[curr] == 2 && curr < i2) {
                swap(nums[i2], nums[curr]);
                i2--;
            } else curr++;
        }
    }
};

int main(void) {
    Solution s;
    vector<int> A = {2,0,2,1,1,0};
    s.sortColors(A);
    for (int i : A) cout << i << " ";
    cout << endl;
    vector<int> A1 = {1,2,0};
    s.sortColors(A1);
    for (int i : A1) cout << i << " ";
    cout << endl;
    vector<int> A2 = {2,0,1};
    s.sortColors(A2);
    for (int i : A2) cout << i << " ";
    cout << endl;
    vector<int> A3 = {2};
    s.sortColors(A3);
    for (int i : A3) cout << i << " ";
    cout << endl;
    return 0;
}