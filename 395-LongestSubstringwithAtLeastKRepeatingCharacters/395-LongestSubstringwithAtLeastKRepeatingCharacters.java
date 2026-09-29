// Last updated: 29/09/2026, 09:03:50
1class Solution {
2
3    public int longestSubstring(String s, int k) {
4        return solve(s, 0, s.length() - 1, k);
5    }
6
7    private int solve(String s, int left, int right, int k) {
8
9        if (right - left + 1 < k) {
10            return 0;
11        }
12
13        int[] freq = new int[26];
14
15        // Count frequency
16        for (int i = left; i <= right; i++) {
17            freq[s.charAt(i) - 'a']++;
18        }
19
20        // Find a character whose frequency < k
21        for (int i = left; i <= right; i++) {
22
23            if (freq[s.charAt(i) - 'a'] < k) {
24
25                int next = i + 1;
26
27                // Skip all consecutive invalid characters
28                while (next <= right &&
29                       freq[s.charAt(next) - 'a'] < k) {
30                    next++;
31                }
32
33                // Solve left and right parts
34                int leftPart = solve(s, left, i - 1, k);
35                int rightPart = solve(s, next, right, k);
36
37                return Math.max(leftPart, rightPart);
38            }
39        }
40
41        // Every character appears at least k times
42        return right - left + 1;
43    }
44}