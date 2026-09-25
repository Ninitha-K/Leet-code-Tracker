// Last updated: 25/09/2026, 09:21:17
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if (dividend == divisor)
4            return 1;
5
6        
7        boolean isPositive = (dividend < 0) == (divisor < 0);
8
9        
10        long a = Math.abs((long) dividend);
11        long b = Math.abs((long) divisor);
12        long ans = 0;
13
14        
15        while (a >= b) {
16            int q = 0;
17            
18            
19            while (a > (b << (q + 1)))
20                q++;
21            
22            
23            ans += (1L << q);
24            a -= (b << q);
25        }
26
27        
28        if (ans == (1L << 31) && isPositive)
29            return Integer.MAX_VALUE;
30
31        
32        return isPositive ? (int) ans : (int) -ans;
33    }
34}