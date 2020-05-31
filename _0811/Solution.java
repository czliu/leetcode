// 811. 子域名访问计数
// #easy
// -

package _0811;

import java.util.*;

class Solution {

    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ans = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        int n = cpdomains.length;
        if (n == 0) return ans;
        for (int i=0;i<n;++i) {
            String cur = cpdomains[i];
            int num = 0;
            for (int j=0;j<cur.length();++j) {
                if (cur.charAt(j) == ' ') num = Integer.parseInt(cur.substring(0, j));
                if (cur.charAt(j) == ' ' || cur.charAt(j) == '.') {
                    String domain = cur.substring(j+1);
                    map.put(domain, map.getOrDefault(domain, 0) + num);
                }
            }
        }
        for (String s : map.keySet()) {
            StringBuilder sb = new StringBuilder(String.valueOf(map.get(s)));
            sb.append(" ").append(s);
            ans.add(sb.toString());
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] cpdomains = new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> ans = s.subdomainVisits(cpdomains);
        System.out.println(ans);
    }
}