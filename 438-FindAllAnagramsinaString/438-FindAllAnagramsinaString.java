// Last updated: 29/09/2026, 09:10:07
1import java.util.*;
2
3class Solution {
4    public List<Integer> findAnagrams(String s, String p) {
5
6        List<Integer> result = new ArrayList<>();
7
8        if (s.length() < p.length()) {
9            return result;
10        }
11
12        int[] pFreq = new int[26];
13        int[] windowFreq = new int[26];
14
15        // Frequency of p
16        for (char ch : p.toCharArray()) {
17            pFreq[ch - 'a']++;
18        }
19
20        int windowSize = p.length();
21
22        // First window
23        for (int i = 0; i < windowSize; i++) {
24            windowFreq[s.charAt(i) - 'a']++;
25        }
26
27        // Check first window
28        if (Arrays.equals(pFreq, windowFreq)) {
29            result.add(0);
30        }
31
32        // Slide the window
33        for (int i = windowSize; i < s.length(); i++) {
34
35            // Add new character
36            windowFreq[s.charAt(i) - 'a']++;
37
38            // Remove old character
39            windowFreq[s.charAt(i - windowSize) - 'a']--;
40
41            // Check if anagram
42            if (Arrays.equals(pFreq, windowFreq)) {
43                result.add(i - windowSize + 1);
44            }
45        }
46
47        return result;
48    }
49}