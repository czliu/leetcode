// 0056. Merge Intervals

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool sortcol(const vector<int>& v1, const vector<int>& v2){
    return v1[0] < v2[0];
}

class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        if (intervals.size() == 1) return intervals;
        sort(intervals.begin(), intervals.end(), sortcol);
        for (int i=0;i<=intervals.size()-2;i++){
            //interval.size() is an unsigned integer
            if (intervals.size() <= 1) break;
            if (intervals[i][1] >= intervals[i+1][0]){
                intervals[i][1] = max(intervals[i][1], intervals[i+1][1]);
                intervals.erase(intervals.begin()+i+1);
                i--;
            }
        }
        return intervals;
    }
};

int main(void){
    vector<vector<int>> intervals = {{1,4},{0,2},{3,5}};
    Solution s;
    vector<vector<int>> result = s.merge(intervals);
    for (int i=0;i<=result.size()-1;i++){
        cout << "[" << result[i][0] << "," <<  result[i][1] << "] ";
    }
    vector<vector<int>> intervals2 = {{1,4},{4,5}};
    vector<vector<int>> result2 = s.merge(intervals2);
    for (int i=0;i<=result2.size()-1;i++){
        cout << "[" << result2[i][0] << "," <<  result2[i][1] << "] ";
    }
    return 0;
}