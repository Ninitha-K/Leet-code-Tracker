// Last updated: 17/07/2026, 14:55:19
1class Solution {
2    public String getPermutation(int n, int k) {
3        if(n == 1) return "1";
4        StringBuilder sb = new StringBuilder();
5        for(int i = 1; i <= n; i++) sb.append(i);
6        int factorial = 1;
7        for(int i = 2; i < n; i++) factorial *= i;
8        n--;
9
10        StringBuilder result = new StringBuilder();
11        while(k > 0) {
12            if(k % factorial == 0) {
13                result.append(sb.charAt((k / factorial) - 1));
14                sb.deleteCharAt((k / factorial) - 1);
15            } else {
16                result.append(sb.charAt(k / factorial));
17                sb.deleteCharAt(k / factorial);
18            } 
19
20            k %= factorial;
21            factorial /= n;
22            n--;
23        }
24
25        for(int i = sb.length() - 1; i >= 0; i--) result.append(sb.charAt(i));
26        return result.toString();
27    }
28}