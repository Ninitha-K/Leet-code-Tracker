// Last updated: 23/07/2026, 09:06:56
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        int n = s.length();
4        boolean[] dp = new boolean[n + 1];
5        dp[0] = true;
6        int max_len = 0;
7        for (String word : wordDict) {
8            max_len = Math.max(max_len, word.length());
9        }
10
11        for (int i = 1; i <= n; i++) {
12            for (int j = i - 1; j >= Math.max(i - max_len - 1, 0); j--) {
13                if (dp[j] && wordDict.contains(s.substring(j, i))) {
14                    dp[i] = true;
15                    break;
16                }
17            }
18        }
19
20        return dp[n];
21    }
22}