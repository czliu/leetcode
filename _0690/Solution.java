// 0690. 员工的重要性
// #easy
// -

package _0690;

//import java.util.*;

/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

// class Solution {
//     public int getImportance(List<Employee> employees, int id) {
//         Map<Integer, Employee> map = new HashMap<>();
//         for (Employee a : employees) {
//             map.put(a.id, a);
//         }
//         Stack<Integer> stack = new Stack<>();
//         stack.push(id);
//         int ans = 0;
//         while (!stack.isEmpty()) {
//             int i = stack.pop();
//             Employee e = map.get(i);
//             ans += e.importance;
//             for (int j : e.subordinates) stack.push(j);
//         }
//         return ans;
//     }
// }