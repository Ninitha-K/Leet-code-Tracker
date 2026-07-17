// Last updated: 17/07/2026, 09:24:19
1class Solution {
2    public String multiply(String num1, String num2) {
3        int m = num1.length();
4        int n = num2.length();
5        int[] res = new int[m + n];
6        for (int i = m - 1; i >= 0; i--) {
7            int d1 = num1.charAt(i) - '0';
8
9            for (int j = n - 1; j >= 0; j--) {
10                int d2 = num2.charAt(j) - '0';
11                int mul = d1 * d2;
12
13                int p1 = i + j;
14                int p2 = i + j + 1;
15
16                int sum = mul + res[p2];
17
18                res[p2] = sum % 10;
19                res[p1] += sum / 10;
20            }
21        }
22        StringBuilder sb = new StringBuilder();
23
24        for (int num : res) {
25            if (!(sb.length() == 0 && num == 0)) {
26                sb.append(num);
27            }
28        }
29
30        return sb.length() == 0 ? "0" : sb.toString();
31    }
32}