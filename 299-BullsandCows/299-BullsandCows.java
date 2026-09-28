// Last updated: 28/09/2026, 09:26:23
1class Solution {
2    public String getHint(String secret, String guess) {
3        int[] secretcount = new int[10];
4        int[] guesscount = new int[10];
5        int bulls = 0;
6        int cows = 0;
7
8        for (int i = 0; i < 10; i++) {
9            secretcount[i] = 0;
10            guesscount[i] = 0;
11        }
12
13        for (int j = 0; j < secret.length(); j++) {
14            if (secret.charAt(j) == guess.charAt(j)) {
15                bulls += 1;
16            } else {
17                secretcount[secret.charAt(j) - '0'] += 1;
18                guesscount[guess.charAt(j) - '0'] += 1;
19            }
20        }
21
22        for (int p = 0; p < 10; p++) {
23            cows += Math.min(secretcount[p], guesscount[p]);
24        }
25
26        return bulls + "A" + cows + "B";
27    }
28}