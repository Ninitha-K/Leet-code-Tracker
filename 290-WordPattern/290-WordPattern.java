// Last updated: 23/07/2026, 09:11:43
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] words = s.split(" ");
4        
5        if (pattern.length() != words.length) {
6            return false;}
7
8        HashMap<Character, String> charToWord = new HashMap<>();
9        HashSet<String> seenWords = new HashSet<>();
10
11        for (int i = 0; i < pattern.length(); i++) {
12            char c = pattern.charAt(i);
13            String w = words[i];
14
15            if (charToWord.containsKey(c)) {
16                if (!charToWord.get(c).equals(w)) {
17                    return false;}
18            } else {
19                if (seenWords.contains(w)) {
20                    return false;}
21                charToWord.put(c, w);
22                seenWords.add(w);}}
23        return true;
24    }
25}