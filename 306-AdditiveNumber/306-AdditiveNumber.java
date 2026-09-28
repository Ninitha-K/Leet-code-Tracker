// Last updated: 28/09/2026, 09:31:24
1import java.math.BigInteger;
2
3public class Solution {
4    public boolean isAdditiveNumber(String num) {
5        int n = num.length();
6        for (int i = 1; i <= n / 2; ++i) {
7            if (num.charAt(0) == '0' && i > 1) return false;
8            BigInteger x1 = new BigInteger(num.substring(0, i));
9            for (int j = 1; Math.max(j, i) <= n - i - j; ++j) {
10                if (num.charAt(i) == '0' && j > 1) break;
11                BigInteger x2 = new BigInteger(num.substring(i, i + j));
12                if (isValid(x1, x2, j + i, num)) return true;
13            }
14        }
15        return false;
16    }
17    private boolean isValid(BigInteger x1, BigInteger x2, int start, String num) {
18        if (start == num.length()) return true;
19        x2 = x2.add(x1);
20        x1 = x2.subtract(x1);
21        String sum = x2.toString();
22        return num.startsWith(sum, start) && isValid(x1, x2, start + sum.length(), num);
23    }
24}
25