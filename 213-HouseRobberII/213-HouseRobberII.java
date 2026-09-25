// Last updated: 25/09/2026, 10:06:44
1class Solution {
2
3    public int rob(int[] nums) {
4
5        int n = nums.length;
6
7        if (n == 1) {
8            return nums[0];
9        }
10
11        // Case 1: Exclude first house
12        int case1 = robRange(nums, 1, n - 1);
13
14        // Case 2: Exclude last house
15        int case2 = robRange(nums, 0, n - 2);
16
17        return Math.max(case1, case2);
18    }
19
20    private int robRange(int[] nums, int start, int end) {
21
22        int prev2 = 0;
23        int prev1 = 0;
24
25        for (int i = start; i <= end; i++) {
26
27            int rob = nums[i] + prev2;
28            int skip = prev1;
29
30            int current = Math.max(rob, skip);
31
32            prev2 = prev1;
33            prev1 = current;
34        }
35
36        return prev1;
37    }
38}