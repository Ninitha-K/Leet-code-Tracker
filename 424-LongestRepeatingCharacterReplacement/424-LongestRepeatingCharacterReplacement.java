// Last updated: 29/09/2026, 09:07:55
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int n = s.length();
4        int[] freq = new int[26];
5        int maxLen = 0, maxFreq = 0, left = 0, right = 0;
6
7        while(right < n){
8            char ch = s.charAt(right);
9            freq[ch - 'A']++;
10            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
11
12            if((right - left + 1) - maxFreq > k){
13                freq[s.charAt(left) - 'A']--;
14                left++;
15            }
16
17            maxLen = Math.max(maxLen , (right - left + 1));
18            right++;
19        }
20
21        return maxLen;
22    }
23}