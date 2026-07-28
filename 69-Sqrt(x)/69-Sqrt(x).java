// Last updated: 28/07/2026, 21:22:46
1class Solution {
2    public int mySqrt(int x) {
3        if (x == 0 || x == 1) return x;
4
5    int start = 1, end = x;
6
7    while (start <= end) {
8        int mid = start + (end - start) / 2;
9        long sq = (long) mid * mid;
10
11        if (sq == x) return mid;
12        if (sq > x) end = mid - 1;
13        else start = mid + 1;
14    }
15    return end;
16    }
17}