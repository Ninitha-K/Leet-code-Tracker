// Last updated: 19/07/2026, 09:16:53
1class Solution {
2    public boolean canReach(int[] start, int[] target) {
3       int startColor=(start[0]+start[1])%2;
4        int targetColor=(target[0]+target[1])%2;
5        return startColor==targetColor;
6        
7    }
8}