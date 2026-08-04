// Last updated: 04/08/2026, 10:17:43
1class Solution {
2    public int trailingZeroes(int n) {
3        int ans = 0;
4
5        while (n > 0) {
6            n /= 5;
7            ans += n;
8        }
9
10        return ans;
11    }
12}