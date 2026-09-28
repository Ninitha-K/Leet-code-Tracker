// Last updated: 28/09/2026, 09:27:53
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3
4        int n = nums.length;
5
6        int[] dp = new int[n];
7
8        // Every element itself is an increasing subsequence
9        for (int i = 0; i < n; i++) {
10            dp[i] = 1;
11        }
12
13        int answer = 1;
14
15        for (int i = 0; i < n; i++) {
16
17            for (int j = 0; j < i; j++) {
18
19                if (nums[j] < nums[i]) {
20
21                    dp[i] = Math.max(dp[i], dp[j] + 1);
22                }
23            }
24
25            answer = Math.max(answer, dp[i]);
26        }
27
28        return answer;
29    }
30}