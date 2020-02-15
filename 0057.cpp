// 0056. Insert Interval

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// Note: sort not needed because the intervals were initially sorted according to their start times
// bool sortcol(const vector<int>& v1, const vector<int>& v2){
//     return v1[0] < v2[0];
// }

class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        // Note: sort not needed because the intervals were initially sorted according to their start times
        // sort(intervals.begin(), intervals.end(), sortcol); 
        vector<vector<int>> result;
        if (intervals.size() == 0) {
            result.push_back(newInterval);
            return result;
        }
        for (int i=0;i<=intervals.size()-1;i++){
            if (intervals[i][0] <= newInterval[0]) {
                result.push_back(intervals[i]);
            }
            else break;
        }
        int n = result.size();
        // merge result.back() with newInterval
        if (n == 0 || result.back()[1] < newInterval[0]) result.push_back(newInterval);
        else result.back()[1] = max(result.back()[1], newInterval[1]);
        //merge result.back() with intervals[n], intervals[n+1],...
        for (int i=n;i<=intervals.size()-1;i++){
            if (result.back()[1] < intervals[i][0]) result.push_back(intervals[i]);
            else result.back()[1] = max(result.back()[1], intervals[i][1]);
        }
        return result;
    }
};

int main(void){
    Solution s;
    vector<vector<int>> intervals = {{1,3},{6,9}};
    vector<int> newInterval = {2,5};
    vector<vector<int>> result = s.insert(intervals, newInterval);
    for (int i=0;i<=result.size()-1;i++){
        cout << "[" << result[i][0] << "," <<  result[i][1] << "] ";
    }
    cout << endl;
    vector<vector<int>> intervals2 = {{1,2},{3,5},{6,7},{8,10},{12,16}};
    vector<int> newInterval2 = {4,8};
    vector<vector<int>> result2 = s.insert(intervals2, newInterval2);
    for (int i=0;i<=result2.size()-1;i++){
        cout << "[" << result2[i][0] << "," <<  result2[i][1] << "] ";
    }
    return 0;
}